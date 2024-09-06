package com.coinbase.examples;

import com.coinbase.advanced.client.CoinbaseAdvancedClient;
import com.coinbase.advanced.credentials.CoinbaseAdvancedCredentials;
import com.coinbase.advanced.model.portfolios.ListPortfoliosRequest;
import com.coinbase.advanced.model.portfolios.ListPortfoliosResponse;
import com.coinbase.advanced.portfolios.PortfoliosServiceImpl;
import com.coinbase.advanced.portfolios.PortfoliosService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            String credsStringBlob = System.getenv("ADVANCED_TRADE_CREDENTIALS");
            if (credsStringBlob == null) {
                throw new RuntimeException("ADVANCED_TRADE_CREDENTIALS environment variable is not set");
            }

            ObjectMapper mapper = new ObjectMapper();

            CoinbaseAdvancedCredentials credentials = new CoinbaseAdvancedCredentials(credsStringBlob);
            CoinbaseAdvancedClient httpClient = new CoinbaseAdvancedClient(credentials);
            PortfoliosService portfolioService = new PortfoliosServiceImpl(httpClient);

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
