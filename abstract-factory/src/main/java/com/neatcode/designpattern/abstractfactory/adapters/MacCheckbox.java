package com.neatcode.designpattern.abstractfactory.adapters;

import com.neatcode.designpattern.abstractfactory.ports.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Mac CheckBox implemented");
    }
}
