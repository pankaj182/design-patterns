package com.neatcode.designpattern.abstractfactory;

import com.neatcode.designpattern.abstractfactory.enums.OS;
import com.neatcode.designpattern.abstractfactory.factories.AbstractFactory;
import com.neatcode.designpattern.abstractfactory.ports.GUIFactory;

public class Application {
    public static void main(String[] args) {
        GUIFactory macUIFactory = AbstractFactory.getFactory(OS.MAC);
        macUIFactory.createButton().render();
        macUIFactory.createCheckbox().render();

        GUIFactory windowsUIFactory = AbstractFactory.getFactory(OS.WINDOWS);
        windowsUIFactory.createButton().render();
        windowsUIFactory.createCheckbox().render();
    }
}
