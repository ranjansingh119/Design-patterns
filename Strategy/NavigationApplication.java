package org.example.code.designPatterns.Strategy;


import org.example.code.designPatterns.Strategy.Context.NavigationContext;
import org.example.code.designPatterns.Strategy.Interface.RoutingStrategy;
import org.example.code.designPatterns.Strategy.NavigationStrategies.DriveOnRoadStrategy;

public class NavigationApplication {

    public static void main(String[] args) {
        NavigationContext navigation = new NavigationContext();
        RoutingStrategy strategy = new DriveOnRoadStrategy();
        navigation.setRoutingStrategy(strategy);
        System.out.println(navigation.navigateOnContext().getStrategyContext());
    }
}
