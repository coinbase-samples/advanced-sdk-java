package com.coinbase.advanced.client;

import com.coinbase.advanced.credentials.CoinbaseCredentials;
import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;
import com.coinbase.advanced.model.account.ListAccountsRequest;
import com.coinbase.advanced.model.account.ListAccountsResponse;
import com.coinbase.advanced.model.portfolio.ListPortfoliosRequest;
import com.coinbase.advanced.model.portfolio.ListPortfoliosResponse;
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

    public <T> T doGet(CoinbaseAdvancedGetRequest request, Class<T> responseClass) throws Exception {
        String requestMethod = "GET";
        String path = Constants.API_BASE_PATH + request.getPath();

        String jwtHost = new URI(baseUrl).getHost();
        String jwtToken = credentials.generateJwt(requestMethod, jwtHost, path);
        System.out.println("Generated JWT in client: " + jwtToken);

        URI requestUri = new URI(baseUrl + path);
        System.out.println("Request URI in client: " + requestUri.toString());

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(requestUri)
                .header("Authorization", "Bearer " + jwtToken)
                .header("Accept", "application/json")
                .GET()
                .build();

        System.out.println("Request Headers in client:");
        httpRequest.headers().map().forEach((key, value) -> System.out.println(key + ": " + value));

        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println("Response status code: " + response.statusCode());
        System.out.println("Response body: " + response.body());

        if (response.statusCode() != 200) {
            throw new RuntimeException("Failed to complete request, status code: " + response.statusCode());
        }

        try {
            return mapper.readValue(response.body(), responseClass);
        } catch (Exception e) {
            throw new RuntimeException("Failed to parse response: " + e.getMessage(), e);
        }
    }

    public ListAccountsResponse listAccounts(ListAccountsRequest request) throws Exception {
        ListAccountsResponse resp = doGet(request, ListAccountsResponse.class);

        return new ListAccountsResponse.Builder()
                .pagination(resp.getPagination())
                .accounts(resp.getAccounts())
                .request(request)
                .build();
    }

    public ListPortfoliosResponse listPortfolios(ListPortfoliosRequest request) throws Exception {
        ListPortfoliosResponse resp = doGet(request, ListPortfoliosResponse.class);

        return new ListPortfoliosResponse.Builder()
                .portfolios(resp.getPortfolios())
                .request(request)
                .build();
    }
}
