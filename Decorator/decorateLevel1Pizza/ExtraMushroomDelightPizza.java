package org.example.code.designPatterns.Decorator.decorateLevel1Pizza;

import org.example.code.designPatterns.Decorator.abstractClass.BasePizza;
import org.example.code.designPatterns.Decorator.abstractClass.PizzaToppingsDecorator;

public class ExtraMushroomDelightPizza extends PizzaToppingsDecorator {

    BasePizza basePizza;

    public ExtraMushroomDelightPizza(BasePizza pizza) {
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 50;
    }
}
