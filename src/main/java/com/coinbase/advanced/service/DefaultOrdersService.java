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

package com.coinbase.advanced.service;

import com.coinbase.advanced.client.CoinbaseAdvancedClient;
import com.coinbase.advanced.errors.CoinbaseAdvancedException;
import com.coinbase.advanced.model.orders.*;

public class DefaultOrdersService implements OrdersService {

    private final CoinbaseAdvancedClient httpClient;

    public DefaultOrdersService(CoinbaseAdvancedClient httpClient) {
        this.httpClient = httpClient;
    }

    @Override
    public ListOrdersResponse listOrders(ListOrdersRequest request) throws CoinbaseAdvancedException {
        ListOrdersResponse resp = httpClient.doGet(request, ListOrdersResponse.class);
        return ListOrdersResponse.Builder.from(resp)
                .build();
    }

    @Override
    public GetOrderResponse getOrder(GetOrderRequest request) throws CoinbaseAdvancedException {
        GetOrderResponse resp = httpClient.doGet(request, GetOrderResponse.class);
        return GetOrderResponse.Builder.from(resp)
                .build();
    }

    @Override
    public ListFillsResponse listFills(ListFillsRequest request) throws CoinbaseAdvancedException {
        ListFillsResponse resp = httpClient.doGet(request, ListFillsResponse.class);
        return ListFillsResponse.Builder.from(resp)
                .build();
    }

    @Override
    public CreateOrderPreviewResponse createOrderPreview(CreateOrderPreviewRequest request) throws CoinbaseAdvancedException {
        CreateOrderPreviewResponse resp = httpClient.doPost(request, CreateOrderPreviewResponse.class);
        return CreateOrderPreviewResponse.Builder.from(resp)
                .build();
    }

    @Override
    public CreateOrderResponse createOrder(CreateOrderRequest request) throws CoinbaseAdvancedException {
        CreateOrderResponse resp = httpClient.doPost(request, CreateOrderResponse.class);
        return CreateOrderResponse.Builder.from(resp).build();
    }

    @Override
    public CancelOrdersResponse cancelOrders(CancelOrdersRequest request) throws CoinbaseAdvancedException {
        CancelOrdersResponse resp = httpClient.doPost(request, CancelOrdersResponse.class);
        return CancelOrdersResponse.Builder.from(resp).build();
    }

    @Override
    public EditOrderResponse editOrder(EditOrderRequest request) throws CoinbaseAdvancedException {
        EditOrderResponse resp = httpClient.doPost(request, EditOrderResponse.class);
        return EditOrderResponse.Builder.from(resp)
                .build();
    }

    @Override
    public PreviewEditOrderResponse previewEditOrder(PreviewEditOrderRequest request) throws CoinbaseAdvancedException {
        PreviewEditOrderResponse resp = httpClient.doPost(request, PreviewEditOrderResponse.class);
        return PreviewEditOrderResponse.Builder.from(resp).build();
    }
}
