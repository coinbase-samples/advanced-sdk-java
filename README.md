# Coinbase Advanced Trade Java SDK README

## Overview

The *Advanced Java SDK* is a sample library that demonstrates the structure of a [Coinbase Advanced Trade](https://advanced.coinbase.com/) driver for
the [REST APIs](https://docs.cdp.coinbase.com/advanced-trade/reference).

## License

The *Advanced Java SDK* sample library is free and open source and released under the [Apache License, Version 2.0](LICENSE).

The application and code are only available for demonstration purposes.

## Usage

To use the *Advanced Java SDK*, initialize the Credentials class and create a new client. The Credentials struct is JSON
enabled. See an example of this inside of the [main.java.com.coinbase.examples package](https://github.com/coinbase-samples/advanced-sdk-java/blob/main/src/main/java/com/coinbase/examples/Main.java). Ensure that Advanced API credentials are stored in a secure manner.

The JSON format expected for `Advanced_CREDENTIALS` is:

```
{
  "accessKey": "",
  "privatePemKey": "",
}
```

Coinbase Advanced API credentials can be created in the Advanced web console under API.

Once the client is initialized, make the desired call. For example, to [list portfolios](https://docs.cdp.coinbase.com/advanced-trade/reference/retailbrokerageapi_getportfolios), pass in the request object, check for an error, and if nil, process the response.

```java
ListPortfoliosRequest listReq = new ListPortfoliosRequest();
ListPortfoliosResponse listResponse = client.listPortfolios(listReq);

String prettyJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(listResponse);
System.out.println("List Portfolios Response:");
System.out.println(prettyJson);
```

To make API calls, create a request object using the builder pattern, call the desired method on the client with the request object and then process and print the response. See an example of this inside of the [main.java.com.coinbase.examples package](https://github.com/coinbase-samples/advanced-sdk-java/blob/main/src/main/java/com/coinbase/examples/Main.java).

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
