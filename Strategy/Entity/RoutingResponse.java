package org.example.code.designPatterns.Strategy.Entity;


public class RoutingResponse {

    String strategyContext;
    String routingId;


    public RoutingResponse(String strategyContext, String routingId) {
        this.strategyContext = strategyContext;
        this.routingId = routingId;
    }

    public String getStrategyContext() {
        return strategyContext;
    }

    public String getRoutingId() {
        return routingId;
    }
}
