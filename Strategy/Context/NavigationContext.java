package org.example.code.designPatterns.Strategy.Context;

import org.example.code.designPatterns.Strategy.Entity.RoutingResponse;
import org.example.code.designPatterns.Strategy.Interface.RoutingStrategy;

public class NavigationContext {

    private RoutingStrategy routingStrategy;

    public void setRoutingStrategy(RoutingStrategy routingStrategy) {
        this.routingStrategy = routingStrategy;
    }

    public RoutingResponse navigateOnContext() {
        return routingStrategy.navigate();
    }
}
