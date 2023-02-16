package org.example.code.designPatterns.AbstractFactory.factoryService;

import org.example.code.designPatterns.AbstractFactory.productService.Button;
import org.example.code.designPatterns.AbstractFactory.productService.CheckBox;

public interface GuiFactoryService {

    Button createButton();
    CheckBox createCheckBox();
}
