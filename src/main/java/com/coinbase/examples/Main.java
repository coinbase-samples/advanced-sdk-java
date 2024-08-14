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
import com.coinbase.advanced.model.account.GetAccountRequest;
import com.coinbase.advanced.model.account.GetAccountResponse;
import com.coinbase.advanced.model.fees.GetTransactionsSummaryRequest;
import com.coinbase.advanced.model.fees.GetTransactionsSummaryResponse;
import com.coinbase.advanced.model.market.GetServerTimeResponse;
import com.coinbase.advanced.model.paymentmethods.GetPaymentMethodRequest;
import com.coinbase.advanced.model.paymentmethods.GetPaymentMethodResponse;
import com.coinbase.advanced.model.paymentmethods.ListPaymentMethodsRequest;
import com.coinbase.advanced.model.paymentmethods.ListPaymentMethodsResponse;
import com.coinbase.advanced.model.portfolio.GetPortfolioBreakdownRequest;
import com.coinbase.advanced.model.portfolio.GetPortfolioBreakdownResponse;
import com.coinbase.advanced.model.portfolio.ListPortfoliosRequest;
import com.coinbase.advanced.model.portfolio.ListPortfoliosResponse;
import com.coinbase.advanced.model.product.*;
import com.coinbase.advanced.utils.Constants;
import com.coinbase.advanced.credentials.CoinbaseCredentials;
import com.coinbase.advanced.model.account.ListAccountsRequest;
import com.coinbase.advanced.model.account.ListAccountsResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Retrieve and parse credentials from environment
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

//            ListPaymentMethodsRequest request = new ListPaymentMethodsRequest();
//            ListPaymentMethodsResponse listResponse = client.listPaymentMethods(request);

//            GetPaymentMethodRequest request = new GetPaymentMethodRequest.Builder()
//                    .paymentMethodId("ef38dddf-af89-4265-87be-b4ba58b318c2")
//                    .build();
//            GetPaymentMethodResponse getResponse = client.getPaymentMethod(request);

            GetServerTimeResponse getResponse = client.getServerTime();


            String prettyJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(getResponse);
            System.out.println("List Accounts Response:");
            System.out.println(prettyJson);

        } catch (Throwable e) {
            throw new RuntimeException("Failed to retrieve the list accounts response", e);
        }
    }
}
