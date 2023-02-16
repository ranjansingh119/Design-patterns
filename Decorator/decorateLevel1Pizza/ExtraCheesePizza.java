package org.example.code.designPatterns.Decorator.decorateLevel1Pizza;

import org.example.code.designPatterns.Decorator.abstractClass.BasePizza;
import org.example.code.designPatterns.Decorator.abstractClass.PizzaToppingsDecorator;

/**
 * ExtraCheesePizza has-a & is-a relationship with BasePizza
 * Since it has-a basePizza object
 * And it is a basePizza in itself
 */
public class ExtraCheesePizza extends PizzaToppingsDecorator {

    BasePizza basePizza;

    public ExtraCheesePizza(BasePizza pizza) {
        basePizza = pizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 80;
    }
}
