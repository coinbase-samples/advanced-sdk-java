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

package com.coinbase.advanced.client;

import com.coinbase.advanced.errors.CoinbaseAdvancedException;
import com.coinbase.advanced.model.account.ListAccountsRequest;
import com.coinbase.advanced.model.account.ListAccountsResponse;
import com.coinbase.advanced.model.portfolio.ListPortfoliosRequest;
import com.coinbase.advanced.model.portfolio.ListPortfoliosResponse;

public interface CoinbaseAdvancedApi {
    // Portfolios
    ListPortfoliosResponse listPortfolios(ListPortfoliosRequest request)  throws CoinbaseAdvancedException;

    // Accounts
    ListAccountsResponse listAccounts(ListAccountsRequest request)  throws CoinbaseAdvancedException;

}