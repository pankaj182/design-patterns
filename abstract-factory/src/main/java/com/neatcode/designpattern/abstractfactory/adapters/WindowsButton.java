package com.neatcode.designpattern.abstractfactory.adapters;

import com.neatcode.designpattern.abstractfactory.ports.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows Button implemented");
    }
}
