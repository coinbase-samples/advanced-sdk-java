package com.coinbase.examples;

import com.coinbase.advanced.client.CoinbaseAdvancedClient;
import com.coinbase.advanced.credentials.CoinbaseAdvancedCredentials;
import com.coinbase.advanced.factory.CoinbaseAdvancedServiceFactory;
import com.coinbase.advanced.model.orders.CreateOrderRequest;
import com.coinbase.advanced.model.orders.CreateOrderResponse;
import com.coinbase.advanced.model.orders.MarketIoc;
import com.coinbase.advanced.model.orders.OrderConfiguration;
import com.coinbase.advanced.model.portfolios.ListPortfoliosRequest;
import com.coinbase.advanced.model.portfolios.ListPortfoliosResponse;
import com.coinbase.advanced.orders.OrdersService;
import com.coinbase.advanced.portfolios.PortfoliosService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        try {
            String credsStringBlob = System.getenv("ADVANCED_TRADE_CREDENTIALS");
            if (credsStringBlob == null) {
                throw new RuntimeException("ADVANCED_TRADE_CREDENTIALS environment variable is not set");
            }

            ObjectMapper mapper = new ObjectMapper();

            CoinbaseAdvancedCredentials credentials = new CoinbaseAdvancedCredentials(credsStringBlob);
            CoinbaseAdvancedClient client = new CoinbaseAdvancedClient(credentials);
            PortfoliosService portfolioService = CoinbaseAdvancedServiceFactory.createPortfoliosService(client);

            ListPortfoliosRequest listReq = new ListPortfoliosRequest();

            ListPortfoliosResponse listResponse = portfolioService.listPortfolios(listReq);

            String prettyJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(listResponse);
            System.out.println("List Portfolios Response:");
            System.out.println(prettyJson);

            OrdersService ordersService = CoinbaseAdvancedServiceFactory.createOrdersService(client);

            CreateOrderRequest createOrderRequest = new CreateOrderRequest.Builder()
                    .clientOrderId(UUID.randomUUID().toString())
                    .productId("ADA-USD")
                    .retailPortfolioId(listResponse.getPortfolios().get(0).getUuid())
                    .side("BUY")
                    .orderConfiguration(
                            new OrderConfiguration.Builder()
                                    .marketMarketIoc(
                                            new MarketIoc.Builder()
                                                    .baseSize("1")
                                                    .build())
                                    .build()
                    )
                    .build();
            CreateOrderResponse createOrderResponse = ordersService.createOrder(createOrderRequest);

            prettyJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(createOrderResponse);
            System.out.println("Create Order Response");
            System.out.println(prettyJson);

        } catch (Throwable e) {
            throw new RuntimeException("Failed to retrieve the list portfolios response", e);
        }
    }
}
