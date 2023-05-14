package com.neatcode.designpattern.bridge.adapters;

import com.neatcode.designpattern.bridge.ports.Color;

public class Blue implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying blue color");
    }
}
