package com.coinbase.examples;

import com.coinbase.advanced.client.CoinbaseAdvancedHttpClient;
import com.coinbase.advanced.credentials.CoinbaseCredentials;
import com.coinbase.advanced.model.portfolios.ListPortfoliosRequest;
import com.coinbase.advanced.model.portfolios.ListPortfoliosResponse;
import com.coinbase.advanced.service.DefaultPortfoliosService;
import com.coinbase.advanced.service.PortfoliosService;
import com.coinbase.advanced.utils.Constants;
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
            String accessKey = credentialsMap.get("accessKey");
            String privatePemKey = credentialsMap.get("privatePemKey");

            CoinbaseCredentials credentials = new CoinbaseCredentials(accessKey, privatePemKey);
            CoinbaseAdvancedHttpClient httpClient = new CoinbaseAdvancedHttpClient(credentials, Constants.BASE_URL);
            PortfoliosService portfolioService = new DefaultPortfoliosService(httpClient);

            ListPortfoliosRequest listReq = new ListPortfoliosRequest();

            ListPortfoliosResponse listResponse = portfolioService.listPortfolios(listReq);

            String prettyJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(listResponse);
            System.out.println("List Portfolios Response:");
            System.out.println(prettyJson);

        } catch (Throwable e) {
            throw new RuntimeException("Failed to retrieve the list portfolios response", e);
        }
    }
}
