package com.neatcode.designpattern.abstractfactory.adapters;

import com.neatcode.designpattern.abstractfactory.ports.Button;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Mac Button implemented");
    }
}
