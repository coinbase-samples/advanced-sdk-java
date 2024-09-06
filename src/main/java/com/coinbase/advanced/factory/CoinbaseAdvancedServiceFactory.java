package com.coinbase.advanced.factory;

import com.coinbase.advanced.accounts.AccountsService;
import com.coinbase.advanced.accounts.AccountsServiceImpl;
import com.coinbase.advanced.client.CoinbaseAdvancedClient;
import com.coinbase.advanced.converts.ConvertsService;
import com.coinbase.advanced.converts.ConvertsServiceImpl;
import com.coinbase.advanced.fees.FeesService;
import com.coinbase.advanced.fees.FeesServiceImpl;
import com.coinbase.advanced.futures.FuturesService;
import com.coinbase.advanced.futures.FuturesServiceImpl;
import com.coinbase.advanced.orders.OrdersService;
import com.coinbase.advanced.orders.OrdersServiceImpl;
import com.coinbase.advanced.paymentmethods.PaymentMethodsService;
import com.coinbase.advanced.paymentmethods.PaymentMethodsServiceImpl;
import com.coinbase.advanced.perpetuals.PerpetualsService;
import com.coinbase.advanced.perpetuals.PerpetualsServiceImpl;
import com.coinbase.advanced.portfolios.PortfoliosService;
import com.coinbase.advanced.portfolios.PortfoliosServiceImpl;
import com.coinbase.advanced.products.ProductsService;
import com.coinbase.advanced.products.ProductsServiceImpl;
import com.coinbase.advanced.publics.PublicService;
import com.coinbase.advanced.publics.PublicServiceImpl;

public class CoinbaseAdvancedServiceFactory {
    public static AccountsService createAccountsService(CoinbaseAdvancedClient client) {
        return new AccountsServiceImpl(client);
    }

    public static ConvertsService createConvertsService(CoinbaseAdvancedClient client) {
        return new ConvertsServiceImpl(client);
    }

    public static FeesService createFeesService(CoinbaseAdvancedClient client) {
        return new FeesServiceImpl(client);
    }

    public static FuturesService createFuturesService(CoinbaseAdvancedClient client) {
        return new FuturesServiceImpl(client);
    }

    public static OrdersService createOrdersService(CoinbaseAdvancedClient client) {
        return new OrdersServiceImpl(client);
    }

    public static PaymentMethodsService createPaymentMethodsService(CoinbaseAdvancedClient client) {
        return new PaymentMethodsServiceImpl(client);
    }

    public static PerpetualsService createPerpetualsService(CoinbaseAdvancedClient client) {
        return new PerpetualsServiceImpl(client);
    }

    public static PortfoliosService createPortfoliosService(CoinbaseAdvancedClient client) {
        return new PortfoliosServiceImpl(client);
    }

    public static ProductsService createProductsService(CoinbaseAdvancedClient client) {
        return new ProductsServiceImpl(client);
    }

    public static PublicService createPublicService(CoinbaseAdvancedClient client) {
        return new PublicServiceImpl(client);
    }
}
