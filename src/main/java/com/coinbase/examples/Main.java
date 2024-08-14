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

package com.coinbase.examples;

import com.coinbase.advanced.client.CoinbaseAdvancedApi;
import com.coinbase.advanced.client.CoinbaseAdvancedHttpClient;
import com.coinbase.advanced.model.orders.GetOrderRequest;
import com.coinbase.advanced.model.orders.*;
import com.coinbase.advanced.model.portfolio.*;
import com.coinbase.advanced.utils.Constants;
import com.coinbase.advanced.credentials.CoinbaseCredentials;
import com.coinbase.advanced.model.account.ListAccountsRequest;
import com.coinbase.advanced.model.account.ListAccountsResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            String credsStringBlob = System.getenv(Constants.CREDENTIALS_ENV_VAR);
            if (credsStringBlob == null) {
                throw new RuntimeException("Environment variable " + Constants.CREDENTIALS_ENV_VAR + " is not set or accessible.");
            }

            ObjectMapper mapper = new ObjectMapper();
            Map<String, String> credentialsMap = mapper.readValue(credsStringBlob, Map.class);
            String privateKeyPEM = credentialsMap.get("privatePemKey");
            String accessKey = credentialsMap.get("accessKey");

            // Initialize credentials and HTTP client
            CoinbaseCredentials credentials = new CoinbaseCredentials(accessKey, privateKeyPEM);
            CoinbaseAdvancedApi client = new CoinbaseAdvancedHttpClient(credentials, Constants.BASE_URL);


//            ListPortfoliosRequest listReq = new ListPortfoliosRequest();
//            ListPortfoliosResponse listResponse = client.listPortfolios(listReq);

//            ListOrdersRequest request = new ListOrdersRequest();
//            ListOrdersResponse listResponse = client.listOrders(request);

//            ListFillsRequest request = new ListFillsRequest();
//            ListFillsResponse listResponse = client.listFills(request);

//            GetOrderRequest request = new GetOrderRequest.Builder()
//                    .orderId("1b5e6102-4249-46bc-9fb0-8d74e75d1d87")
//                    .build();
//            GetOrderResponse getResponse = client.getOrder(request);

//            GetPaymentMethodRequest request = new GetPaymentMethodRequest.Builder()
//                    .paymentMethodId("ef38dddf-af89-4265-87be-b4ba58b318c2")
//                    .build();
//            GetPaymentMethodResponse getResponse = client.getPaymentMethod(request);

//            EditPortfolioRequest request = new EditPortfolioRequest.Builder()
//                    .portfolioUuid("f787943d-689d-4c5e-9275-f79bb2608645")
//                    .name("sdk java 4")
//                    .build();
//
//            EditPortfolioResponse delResponse = client.editPortfolio(request);


            CreateOrderPreviewRequest request = new CreateOrderPreviewRequest.Builder()
                    .productId("ETH-USD")
                    .side("BUY")
                    .orderConfiguration(new OrderConfiguration.Builder()
                            .limitLimitGtc(new LimitGtc.Builder()
                                    .baseSize("0.001")
                                    .limitPrice("900")
                                    .build())
                            .build())
                    .build();

            // Manually serialize the request to check for issues
            String requestBody = mapper.writeValueAsString(request);
            System.out.println("Serialized Request Body: " + requestBody);
            CreateOrderPreviewResponse response = client.createOrderPreview(request);
            System.out.println("Create Order Preview Response:");





            String prettyJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(response);
            System.out.println("List Accounts Response:");
            System.out.println(prettyJson);

        } catch (Throwable e) {
            throw new RuntimeException("Failed to retrieve the list accounts response", e);
        }
    }
}
