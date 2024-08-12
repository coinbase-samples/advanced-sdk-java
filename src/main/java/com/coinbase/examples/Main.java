package com.coinbase.examples;

import com.coinbase.advanced.client.CoinbaseAdvancedHttpClient;
import com.coinbase.advanced.model.portfolio.ListPortfoliosRequest;
import com.coinbase.advanced.model.portfolio.ListPortfoliosResponse;
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
            CoinbaseAdvancedHttpClient client = new CoinbaseAdvancedHttpClient(credentials, Constants.BASE_URL);

            // Create and send the ListAccountsRequest
            ListPortfoliosRequest listReq = new ListPortfoliosRequest();
            ListPortfoliosResponse listResponse = client.listPortfolios(listReq);

            String prettyJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(listResponse);
            System.out.println("List Accounts Response:");
            System.out.println(prettyJson);

        } catch (Throwable e) {
            throw new RuntimeException("Failed to retrieve the list accounts response", e);
        }
    }
}
