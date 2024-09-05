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

package com.coinbase.advanced.accounts;

import com.coinbase.advanced.client.CoinbaseAdvancedClient;
import com.coinbase.advanced.errors.CoinbaseAdvancedException;
import com.coinbase.advanced.model.accounts.*;
import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class AccountsServiceImpl extends CoinbaseServiceImpl implements AccountsService {
    public AccountsServiceImpl(CoinbaseAdvancedClient client) {
        super(client);
    }

    @Override
    public ListAccountsResponse listAccounts() throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                "/brokerage/accounts",
                null,
                List.of(200),
                new TypeReference<ListAccountsResponse>() {});
    }

    @Override
    public GetAccountResponse getAccount(GetAccountRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                String.format("/brokerage/accounts/%s", request.getAccountUuid()),
                null,
                List.of(200),
                new TypeReference<GetAccountResponse>() {});
    }
}
