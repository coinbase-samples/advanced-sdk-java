//package com.coinbase.examples;
//
//import com.coinbase.advanced.credentials.CoinbaseCredentials;
//import com.coinbase.advanced.model.account.ListAccountsResponse;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.SerializationFeature;
//
//import java.util.Map;
//import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//
//public class SimpleMain {
//    public static void main(String[] args) throws Exception {
//        String credsStringBlob = System.getenv("RAT_CREDENTIALS");
//        if (credsStringBlob == null) {
//            throw new RuntimeException("Environment variable RAT_CREDENTIALS is not set or accessible.");
//        }
//
//        ObjectMapper mapper = new ObjectMapper();
//        Map<String, String> credentialsMap = mapper.readValue(credsStringBlob, Map.class);
//        String privateKeyPEM = credentialsMap.get("privatePemKey");
//        String accessKey = credentialsMap.get("accessKey");
//
//        CoinbaseCredentials credentials = new CoinbaseCredentials(accessKey, privateKeyPEM);
//
//        String requestMethod = "GET";
//        String host = "api.coinbase.com/api/v3";
//        String path = "/brokerage/accounts"; // Use the request path directly
//
//        String jwtToken = credentials.generateJwt(requestMethod, host, path);
//        System.out.println("Generated JWT in manual: " + jwtToken); // Debugging JWT token
//
//        HttpClient client = HttpClient.newHttpClient();
//        URI requestUri = new URI("https://" + host + path);
//        System.out.println("Request URI in manual: " + requestUri.toString()); // Debugging URI
//
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(requestUri)
//                .header("Authorization", "Bearer " + jwtToken)
//                .header("Accept", "application/json")
//                .GET()
//                .build();
//
//        // Log headers for comparison
//        System.out.println("Request Headers in manual:");
//        request.headers().map().forEach((key, value) -> System.out.println(key + ": " + value));
//
//        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//
//        System.out.println("Response status code: " + response.statusCode());
//        System.out.println("Response body: " + response.body());
//
//        // Process the response as before
//        ListAccountsResponse accountResponse = mapper.readValue(response.body(), ListAccountsResponse.class);
//
//        // Pretty print the response
//        ObjectMapper prettyPrinter = new ObjectMapper();
//        prettyPrinter.enable(SerializationFeature.INDENT_OUTPUT);
//        String prettyJson = prettyPrinter.writerWithDefaultPrettyPrinter().writeValueAsString(accountResponse);
//
//        System.out.println("Response body: " + prettyJson);
//    }
//}
