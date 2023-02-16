package org.example.code.designPatterns.AbstractFactory.productService.productServiceImpl;

import org.example.code.designPatterns.AbstractFactory.productService.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void tickBox() {
        System.out.println("Mac checkbox ticked");
    }
}
