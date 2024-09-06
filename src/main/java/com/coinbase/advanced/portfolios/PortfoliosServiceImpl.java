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

package com.coinbase.advanced.portfolios;

import com.coinbase.advanced.errors.CoinbaseAdvancedException;
import com.coinbase.advanced.model.portfolios.*;
import com.coinbase.advanced.client.CoinbaseAdvancedClient;
import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class PortfoliosServiceImpl extends CoinbaseServiceImpl implements PortfoliosService {
    public PortfoliosServiceImpl(CoinbaseAdvancedClient client) {
        super(client);
    }

    @Override
    public ListPortfoliosResponse listPortfolios(ListPortfoliosRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                "/brokerage/portfolios",
                request,
                List.of(200),
                new TypeReference<ListPortfoliosResponse>() {});
    }

    @Override
    public GetPortfolioBreakdownResponse getPortfolioBreakdown(GetPortfolioBreakdownRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                String.format("/brokerage/portfolios/%s", request.getPortfolioUuid()),
                null,
                List.of(200),
                new TypeReference<GetPortfolioBreakdownResponse>() {});
    }

    @Override
    public CreatePortfolioResponse createPortfolio(CreatePortfolioRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.POST,
                "/brokerage/portfolios",
                request,
                List.of(200),
                new TypeReference<CreatePortfolioResponse>() {});
    }

    @Override
    public DeletePortfolioResponse deletePortfolio(DeletePortfolioRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.DELETE,
                String.format("/brokerage/portfolios/%s", request.getPortfolioUuid()),
                null,
                List.of(200),
                new TypeReference<DeletePortfolioResponse>() {});
    }

    @Override
    public EditPortfolioResponse editPortfolio(EditPortfolioRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.PUT,
                String.format("/brokerage/portfolios/%s", request.getPortfolioUuid()),
                request,
                List.of(200),
                new TypeReference<EditPortfolioResponse>() {});
    }

    @Override
    public MovePortfolioFundsResponse movePortfolioFunds(MovePortfolioFundsRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.POST,
                "/brokerage/portfolios/move_funds",
                request,
                List.of(200),
                new TypeReference<MovePortfolioFundsResponse>() {});
    }
}
