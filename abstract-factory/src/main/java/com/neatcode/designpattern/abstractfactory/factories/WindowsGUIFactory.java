package com.neatcode.designpattern.abstractfactory.factories;

import com.neatcode.designpattern.abstractfactory.adapters.WindowsButton;
import com.neatcode.designpattern.abstractfactory.adapters.WindowsCheckbox;
import com.neatcode.designpattern.abstractfactory.ports.Button;
import com.neatcode.designpattern.abstractfactory.ports.Checkbox;
import com.neatcode.designpattern.abstractfactory.ports.GUIFactory;

public class WindowsGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
