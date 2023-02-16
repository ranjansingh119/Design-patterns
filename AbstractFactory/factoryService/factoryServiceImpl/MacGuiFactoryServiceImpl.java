package org.example.code.designPatterns.AbstractFactory.factoryService.factoryServiceImpl;

import org.example.code.designPatterns.AbstractFactory.factoryService.GuiFactoryService;
import org.example.code.designPatterns.AbstractFactory.productService.Button;
import org.example.code.designPatterns.AbstractFactory.productService.CheckBox;
import org.example.code.designPatterns.AbstractFactory.productService.productServiceImpl.MacButton;
import org.example.code.designPatterns.AbstractFactory.productService.productServiceImpl.MacCheckBox;

public class MacGuiFactoryServiceImpl implements GuiFactoryService {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
