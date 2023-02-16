package org.example.code.designPatterns.AbstractFactory.model;

import org.example.code.designPatterns.AbstractFactory.factoryService.GuiFactoryService;
import org.example.code.designPatterns.AbstractFactory.productService.Button;
import org.example.code.designPatterns.AbstractFactory.productService.CheckBox;

public class GuiApplication {

    private Button button;
    private CheckBox checkBox;

    public GuiApplication(GuiFactoryService guiFactoryService) {
        button = guiFactoryService.createButton();
        checkBox = guiFactoryService.createCheckBox();
    }

    public void action() {
        button.press();
        checkBox.tickBox();
    }
}
