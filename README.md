# Coinbase Advanced Trade Java SDK README

## Overview

The *Advanced Java SDK* is a sample library that demonstrates the structure of a [Coinbase Advanced Trade](https://advanced.coinbase.com/) driver for
the [REST APIs](https://docs.cdp.coinbase.com/advanced-trade/reference).

Coinbase Advanced Trade offers a comprehensive API for traders, providing access to real-time market data, order management, and execution. Elevate your trading strategies and develop sophisticated solutions using our powerful tools and features.

## License

The *Advanced Java SDK* sample library is free and open source and released under the [Apache License, Version 2.0](LICENSE).

The application and code are only available for demonstration purposes.

## Usage

To use the *Advanced Java SDK*, initialize the Credentials class and create a new client. The Credentials struct is JSON
enabled. See an example of this inside of the [main.java.com.coinbase.examples package](./src/main/java/com/coinbase/examples/Main.java). Ensure that Advanced API credentials are stored in a secure manner.

The JSON format expected for `Advanced_CREDENTIALS` is:

```
{
  "apiKeyName": "",
  "privateKey": "",
}
```

Coinbase Advanced API credentials can be created in the Advanced web console under API.

An example of instantiating the credentials and using the PortfoliosService is shown below:

```java
public class Main {
    public static void main(String[] args) {
        String credsStringBlob = System.getenv("ADVANCED_TRADE_CREDENTIALS");
        ObjectMapper mapper = new ObjectMapper();

        try {
            CoinbaseAdvancedCredentials credentials = new CoinbaseAdvancedCredentials(credsStringBlob);
            CoinbaseAdvancedClient client = new CoinbaseAdvancedClient(credentials);

            PortfoliosService portfoliosService = AdvancedServiceFactory.createPortfoliosService(client);
            GetPortfolioByIdResponse portfolioResponse = portfoliosService.getPortfolioById(
                    new GetPortfolioByIdRequest.Builder()
                            .portfolioId(portfolioId)
                            .build());

            System.out.println(mapper.writeValueAsString(portfolioResponse));
        } catch (Exception e) {
            e.printStackTrace(e);
        }
    }
}
```

To see a full working example, see the [`Main`](src/main/java/com/coinbase/examples/Main.java) class under the com.coinbase.examples package.

**Warning** This does place a very small trade for a small amount of ADA. Please ensure that you have the necessary funds in your account before running this code.

## Binaries

Binaries and dependency information for Maven, Gradle, Ivy and others can be found at the [Maven Central Repository](https://central.sonatype.com/search?q=g%3Acom.coinbase.advanced+a%3Acoinbase-advanced-sdk-java&smo=true)

Maven example:

```xml
<dependency>
    <groupId>com.coinbase.advanced</groupId>
    <artifactId>coinbase-advanced-sdk-java</artifactId>
    <version>x.y.z</version>
</dependency>
```

## Build

To build the sample library, ensure that Java Development Kit (JDK) is installed and then run:

```bash
mvn clean install
```
