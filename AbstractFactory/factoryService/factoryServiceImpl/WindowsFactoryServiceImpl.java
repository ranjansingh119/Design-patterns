package org.example.code.designPatterns.AbstractFactory.factoryService.factoryServiceImpl;

import org.example.code.designPatterns.AbstractFactory.factoryService.GuiFactoryService;
import org.example.code.designPatterns.AbstractFactory.productService.Button;
import org.example.code.designPatterns.AbstractFactory.productService.CheckBox;
import org.example.code.designPatterns.AbstractFactory.productService.productServiceImpl.WindowsButton;
import org.example.code.designPatterns.AbstractFactory.productService.productServiceImpl.WindowsCheckBox;

public class WindowsFactoryServiceImpl implements GuiFactoryService {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
