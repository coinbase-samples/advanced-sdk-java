# Coinbase Advanced Trade Java SDK README

## Overview

The *INTX Java SDK* is a sample library that demonstrates the structure of a [Coinbase International Exchange (INTX)](https://international.coinbase.com/) driver for
the [REST APIs](https://docs.cloud.coinbase.com/intx/reference).

## License

The *INTX Java SDK* sample library is free and open source and released under the [Apache License, Version 2.0](LICENSE).

The application and code are only available for demonstration purposes.

## Usage

To use the *INTX Java SDK*, initialize the Credentials class and create a new client. The Credentials struct is JSON
enabled. See an example of this inside of the [main.java.com.coinbase.examples package](https://github.com/coinbase-samples/intx-sdk-java/blob/main/src/main/java/com/coinbase/examples/Main.java). Ensure that INTX API credentials are stored in a secure manner.

The JSON format expected for `INTX_CREDENTIALS` is:

```
{
  "accessKey": "",
  "passphrase": "",
  "signingKey": "",
  "portfolioId": ""
}
```

Coinbase INTX API credentials can be created in the INTX web console under API on the left-hand panel.

Once the client is initialized, make the desired call. For example, to ,
pass in the request object, check for an error, and if nil, process the response.

The client and request objects use the builder pattern, which provides a flexible way to construct objects with optional parameters. For example, in the [list portfolio balances](https://docs.cdp.coinbase.com/intx/reference/getportfoliobalances/) request, you can set only the parameters you need using the builder. 

To make API calls, create a request object using the builder pattern, call the desired method on the client with the request object and then process and print the response. See an example of this inside of the [main.java.com.coinbase.examples package](https://github.com/coinbase-samples/intx-sdk-java/blob/main/src/main/java/com/coinbase/examples/Main.java).

## Binaries

Binaries and dependency information for Maven, Gradle, Ivy and others can be found at the [Maven Central Repository](https://central.sonatype.com/search?q=g%3Acom.coinbase.intx+a%3Acoinbase-intx-sdk-java&smo=true)

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
