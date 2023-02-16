package org.example.code.designPatterns.AbstractFactory.productService.productServiceImpl;

import org.example.code.designPatterns.AbstractFactory.productService.Button;


public class WindowsButton implements Button {
    @Override
    public void press() {
        System.out.println("Windows button pressed");
    }
}
