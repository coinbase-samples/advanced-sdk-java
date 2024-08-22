/*
 * Copyright 2024-present Coinbase Global, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.coinbase.advanced.client;

import com.coinbase.advanced.credentials.CoinbaseCredentials;
import com.coinbase.advanced.errors.CoinbaseAdvancedException;
import com.coinbase.advanced.http.*;
import com.coinbase.advanced.utils.Constants;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CoinbaseAdvancedHttpClient {

    private final CoinbaseCredentials credentials;
    private final HttpClient httpClient;
    private final ObjectMapper mapper;
    private final String baseUrl;

    public CoinbaseAdvancedHttpClient(CoinbaseCredentials credentials, String baseUrl) {
        this.credentials = credentials;
        this.httpClient = HttpClient.newHttpClient();
        this.mapper = new ObjectMapper();
        this.baseUrl = baseUrl;
    }

    private String generateJwtAndBuildUri(String method, String path, String queryString) throws CoinbaseAdvancedException {
        try {
            String jwtHost = new URI(baseUrl).getHost();
            String jwtToken = credentials.generateJwt(method, jwtHost, path);

            String requestUri = baseUrl + path;
            if (queryString != null && !queryString.isEmpty()) {
                requestUri += "?" + queryString;
            }

            return requestUri + "|" + jwtToken;
        } catch (Exception e) {
            throw new CoinbaseAdvancedException("Error generating JWT or building URI", e);
        }
    }

    private HttpRequest buildHttpRequest(String method, String uri, String jwtToken, String body) {
        HttpRequest.Builder requestBuilder = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .header("Authorization", "Bearer " + jwtToken)
                .header("Accept", "application/json");

        if ("POST".equalsIgnoreCase(method) || "PUT".equalsIgnoreCase(method)) {
            requestBuilder.header("Content-Type", "application/json")
                    .method(method, HttpRequest.BodyPublishers.ofString(body));
        } else if ("DELETE".equalsIgnoreCase(method)) {
            requestBuilder.DELETE();
        } else {
            requestBuilder.GET();
        }

        return requestBuilder.build();
    }

    private <T> T sendRequestAndParseResponse(HttpRequest httpRequest, Class<T> responseClass) throws CoinbaseAdvancedException {
        try {
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                throw new CoinbaseAdvancedException(response.statusCode(), "Failed to complete request, status code: " + response.statusCode());
            }

            return mapper.readValue(response.body(), responseClass);
        } catch (Exception e) {
            throw new CoinbaseAdvancedException("Failed to parse response", e);
        }
    }

    public <T> T doGet(CoinbaseAdvancedGetRequest request, Class<T> responseClass) throws CoinbaseAdvancedException {
        String[] uriAndToken = generateJwtAndBuildUri("GET", Constants.API_BASE_PATH + request.getPath(), request.getQueryString()).split("\\|");
        HttpRequest httpRequest = buildHttpRequest("GET", uriAndToken[0], uriAndToken[1], null);
        return sendRequestAndParseResponse(httpRequest, responseClass);
    }

    public <T> T doPost(CoinbaseAdvancedPostRequest request, Class<T> responseClass) throws CoinbaseAdvancedException {
        String[] uriAndToken = generateJwtAndBuildUri("POST", Constants.API_BASE_PATH + request.getPath(), null).split("\\|");
        HttpRequest httpRequest = buildHttpRequest("POST", uriAndToken[0], uriAndToken[1], request.getBody());
        return sendRequestAndParseResponse(httpRequest, responseClass);
    }

    public <T> T doPut(CoinbaseAdvancedPutRequest request, Class<T> responseClass) throws CoinbaseAdvancedException {
        String[] uriAndToken = generateJwtAndBuildUri("PUT", Constants.API_BASE_PATH + request.getPath(), request.getQueryString()).split("\\|");
        HttpRequest httpRequest = buildHttpRequest("PUT", uriAndToken[0], uriAndToken[1], request.getBody());
        return sendRequestAndParseResponse(httpRequest, responseClass);
    }

    public <T> T doDelete(CoinbaseAdvancedDeleteRequest request, Class<T> responseClass) throws CoinbaseAdvancedException {
        String[] uriAndToken = generateJwtAndBuildUri("DELETE", Constants.API_BASE_PATH + request.getPath(), request.getQueryString()).split("\\|");
        HttpRequest httpRequest = buildHttpRequest("DELETE", uriAndToken[0], uriAndToken[1], null);
        return sendRequestAndParseResponse(httpRequest, responseClass);
    }
    public <T> T doGetPublic(String path, String queryString, Class<T> responseClass) throws CoinbaseAdvancedException {
        String requestUri = baseUrl + "/api/v3/brokerage" + path;
        if (queryString != null && !queryString.isEmpty()) {
            requestUri += "?" + queryString;
        }
        HttpRequest httpRequest = buildHttpRequest("GET", requestUri, null, null);
        return sendRequestAndParseResponse(httpRequest, responseClass);
    }
}
