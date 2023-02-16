package org.example.code.designPatterns.Strategy.NavigationStrategies;

import org.example.code.designPatterns.Strategy.Entity.RoutingResponse;
import org.example.code.designPatterns.Strategy.Interface.RoutingStrategy;

public class SeaRouteStrategy implements RoutingStrategy {
    @Override
    public RoutingResponse navigate() {
        return new RoutingResponse("Sea Route", "2");
    }
}
