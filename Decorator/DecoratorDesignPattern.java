package org.example.code.designPatterns.Decorator;

import org.example.code.designPatterns.Decorator.abstractClass.BasePizza;
import org.example.code.designPatterns.Decorator.base.FarmhousePizza;
import org.example.code.designPatterns.Decorator.decorateLevel1Pizza.ExtraCheesePizza;
import org.example.code.designPatterns.Decorator.decorateLevel1Pizza.ExtraMushroomDelightPizza;

public class DecoratorDesignPattern {

    public static void main(String[] args) {

        BasePizza basePizza = new FarmhousePizza();
        ExtraMushroomDelightPizza pizza = new ExtraMushroomDelightPizza(new ExtraCheesePizza(basePizza));
        System.out.println("Pizza cost : "+pizza.cost());
    }
}
