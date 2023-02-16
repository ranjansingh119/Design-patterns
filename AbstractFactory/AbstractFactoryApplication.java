package org.example.code.designPatterns.AbstractFactory;

import org.example.code.designPatterns.AbstractFactory.factoryService.GuiFactoryService;
import org.example.code.designPatterns.AbstractFactory.factoryService.factoryServiceImpl.MacGuiFactoryServiceImpl;
import org.example.code.designPatterns.AbstractFactory.factoryService.factoryServiceImpl.WindowsFactoryServiceImpl;
import org.example.code.designPatterns.AbstractFactory.model.GuiApplication;

public class AbstractFactoryApplication {
    private static GuiApplication configureApplication() {
        GuiApplication app;
        GuiFactoryService factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacGuiFactoryServiceImpl();
        } else {
            factory = new WindowsFactoryServiceImpl();
        }
        app = new GuiApplication(factory);
        return app;
    }

    public static void main(String[] args) {
        GuiApplication app = configureApplication();
        app.action();
    }
}
