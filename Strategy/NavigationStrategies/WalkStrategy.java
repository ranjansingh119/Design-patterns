package org.example.code.designPatterns.Strategy.NavigationStrategies;

import org.example.code.designPatterns.Strategy.Entity.RoutingResponse;
import org.example.code.designPatterns.Strategy.Interface.RoutingStrategy;

public class WalkStrategy implements RoutingStrategy {
    @Override
    public RoutingResponse navigate() {
        return new RoutingResponse("Walk","1");
    }
}
