package com.neatcode.designpattern.abstractfactory.factories;

import com.neatcode.designpattern.abstractfactory.adapters.MacButton;
import com.neatcode.designpattern.abstractfactory.adapters.MacCheckbox;
import com.neatcode.designpattern.abstractfactory.adapters.WindowsButton;
import com.neatcode.designpattern.abstractfactory.adapters.WindowsCheckbox;
import com.neatcode.designpattern.abstractfactory.ports.Button;
import com.neatcode.designpattern.abstractfactory.ports.Checkbox;
import com.neatcode.designpattern.abstractfactory.ports.GUIFactory;

public class MacGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
