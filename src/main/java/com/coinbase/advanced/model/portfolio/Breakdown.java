package com.coinbase.advanced.model.portfolio;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Breakdown {

    @JsonProperty("portfolio")
    private Portfolio portfolio;

    @JsonProperty("portfolio_balances")
    private PortfolioBalances portfolioBalances;

    @JsonProperty("spot_positions")
    private List<SpotPosition> spotPositions;

    @JsonProperty("perp_positions")
    private List<PerpPosition> perpPositions;

    @JsonProperty("futures_positions")
    private List<FuturesPosition> futuresPositions;

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public PortfolioBalances getPortfolioBalances() {
        return portfolioBalances;
    }

    public void setPortfolioBalances(PortfolioBalances portfolioBalances) {
        this.portfolioBalances = portfolioBalances;
    }

    public List<SpotPosition> getSpotPositions() {
        return spotPositions;
    }

    public void setSpotPositions(List<SpotPosition> spotPositions) {
        this.spotPositions = spotPositions;
    }

    public List<PerpPosition> getPerpPositions() {
        return perpPositions;
    }

    public void setPerpPositions(List<PerpPosition> perpPositions) {
        this.perpPositions = perpPositions;
    }

    public List<FuturesPosition> getFuturesPositions() {
        return futuresPositions;
    }

    public void setFuturesPositions(List<FuturesPosition> futuresPositions) {
        this.futuresPositions = futuresPositions;
    }
}
