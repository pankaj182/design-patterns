package com.neatcode.designpattern.abstractfactory.ports;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
