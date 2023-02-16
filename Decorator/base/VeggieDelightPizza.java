package org.example.code.designPatterns.Decorator.base;

import org.example.code.designPatterns.Decorator.abstractClass.BasePizza;

public class VeggieDelightPizza extends BasePizza {

    @Override
    public int cost() {
        return 300;
    }
}
