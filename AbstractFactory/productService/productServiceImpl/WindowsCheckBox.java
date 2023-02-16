package org.example.code.designPatterns.AbstractFactory.productService.productServiceImpl;

import org.example.code.designPatterns.AbstractFactory.productService.CheckBox;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void tickBox() {
        System.out.println("Windows checkbox ticked");
    }
}
