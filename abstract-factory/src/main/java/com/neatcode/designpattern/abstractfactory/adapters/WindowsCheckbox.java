package com.neatcode.designpattern.abstractfactory.adapters;

import com.neatcode.designpattern.abstractfactory.ports.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Windows CheckBox implemented");
    }
}
