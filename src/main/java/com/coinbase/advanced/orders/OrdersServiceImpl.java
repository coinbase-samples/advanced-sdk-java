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

package com.coinbase.advanced.orders;

import com.coinbase.advanced.client.CoinbaseAdvancedClient;
import com.coinbase.advanced.errors.CoinbaseAdvancedException;
import com.coinbase.advanced.model.orders.*;
import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class OrdersServiceImpl extends CoinbaseServiceImpl implements OrdersService {
    public OrdersServiceImpl(CoinbaseAdvancedClient client) {
        super(client);
    }

    @Override
    public ListOrdersResponse listOrders(ListOrdersRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                "/brokerage/orders/historical/batch",
                request,
                List.of(200),
                new TypeReference<ListOrdersResponse>() {});
    }

    @Override
    public GetOrderResponse getOrder(GetOrderRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                String.format("/brokerage/orders/historical/%s", request.getOrderId()),
                null,
                List.of(200),
                new TypeReference<GetOrderResponse>() {});
    }

    @Override
    public ListFillsResponse listFills(ListFillsRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                "/brokerage/orders/historical/fills",
                request,
                List.of(200),
                new TypeReference<ListFillsResponse>() {});
    }

    @Override
    public CreateOrderPreviewResponse createOrderPreview(CreateOrderPreviewRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.POST,
                "/brokerage/orders/preview",
                request,
                List.of(200),
                new TypeReference<CreateOrderPreviewResponse>() {});
    }

    @Override
    public CreateOrderResponse createOrder(CreateOrderRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.POST,
                "/brokerage/orders",
                request,
                List.of(200),
                new TypeReference<CreateOrderResponse>() {});
    }

    @Override
    public CancelOrdersResponse cancelOrders(CancelOrdersRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.POST,
                "/brokerage/orders/batch_cancel",
                request,
                List.of(200),
                new TypeReference<CancelOrdersResponse>() {});
    }

    @Override
    public EditOrderResponse editOrder(EditOrderRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.POST,
                "/brokerage/orders/edit",
                request,
                List.of(200),
                new TypeReference<EditOrderResponse>() {});
    }

    @Override
    public PreviewEditOrderResponse previewEditOrder(PreviewEditOrderRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.POST,
                "/brokerage/orders/edit_preview",
                request,
                List.of(200),
                new TypeReference<PreviewEditOrderResponse>() {});
    }

    @Override
    public ClosePositionResponse closePosition(ClosePositionRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.POST,
                "/brokerage/orders/close_position",
                request,
                List.of(200),
                new TypeReference<ClosePositionResponse>() {});
    }
}
