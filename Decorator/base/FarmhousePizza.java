package org.example.code.designPatterns.Decorator.base;

import org.example.code.designPatterns.Decorator.abstractClass.BasePizza;

public class FarmhousePizza extends BasePizza {
    @Override
    public int cost() {
        return 350;
    }
}
