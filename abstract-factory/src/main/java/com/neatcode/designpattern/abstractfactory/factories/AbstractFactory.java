package com.neatcode.designpattern.abstractfactory.factories;

import com.neatcode.designpattern.abstractfactory.enums.OS;
import com.neatcode.designpattern.abstractfactory.ports.GUIFactory;

public class AbstractFactory {
    public static GUIFactory getFactory(OS os) {
        switch(os) {
            case MAC:
                return new MacGUIFactory();
            case WINDOWS:
                return new WindowsGUIFactory();
        }
        throw new IllegalArgumentException("Invalid os type.");
    }
}
