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

import com.coinbase.advanced.errors.CoinbaseAdvancedException;
import com.coinbase.advanced.model.portfolios.*;
import com.coinbase.advanced.client.CoinbaseAdvancedClient;

public class DefaultPortfoliosService implements PortfoliosService {

    private final CoinbaseAdvancedClient httpClient;

    public DefaultPortfoliosService(CoinbaseAdvancedClient httpClient) {
        this.httpClient = httpClient;
    }

    @Override
    public ListPortfoliosResponse listPortfolios(ListPortfoliosRequest request) throws CoinbaseAdvancedException {
        ListPortfoliosResponse resp = httpClient.doGet(request, ListPortfoliosResponse.class);
        return new ListPortfoliosResponse.Builder()
                .portfolios(resp.getPortfolios())
                .build();
    }

    @Override
    public GetPortfolioBreakdownResponse getPortfolioBreakdown(GetPortfolioBreakdownRequest request) throws CoinbaseAdvancedException {
        GetPortfolioBreakdownResponse resp = httpClient.doGet(request, GetPortfolioBreakdownResponse.class);
        return new GetPortfolioBreakdownResponse.Builder()
                .breakdown(resp.getBreakdown())
                .build();
    }

    @Override
    public CreatePortfolioResponse createPortfolio(CreatePortfolioRequest request) throws CoinbaseAdvancedException {
        CreatePortfolioResponse resp = httpClient.doPost(request, CreatePortfolioResponse.class);
        return CreatePortfolioResponse.Builder.from(resp)
                .build();
    }

    @Override
    public DeletePortfolioResponse deletePortfolio(DeletePortfolioRequest request) throws CoinbaseAdvancedException {
        DeletePortfolioResponse resp = httpClient.doDelete(request, DeletePortfolioResponse.class);
        return new DeletePortfolioResponse.Builder()
                .description(resp.getDescription())
                .schema(resp.getSchema())
                .build();
    }

    @Override
    public EditPortfolioResponse editPortfolio(EditPortfolioRequest request) throws CoinbaseAdvancedException {
        EditPortfolioResponse resp = httpClient.doPut(request, EditPortfolioResponse.class);
        return EditPortfolioResponse.Builder.from(resp)
                .build();
    }

    @Override
    public MovePortfolioFundsResponse movePortfolioFunds(MovePortfolioFundsRequest request) throws CoinbaseAdvancedException {
        MovePortfolioFundsResponse resp = httpClient.doPost(request, MovePortfolioFundsResponse.class);
        return MovePortfolioFundsResponse.Builder.from(resp)
                .build();
    }
}
