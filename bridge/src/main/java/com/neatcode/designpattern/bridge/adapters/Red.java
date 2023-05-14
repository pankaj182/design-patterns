package com.neatcode.designpattern.bridge.adapters;

import com.neatcode.designpattern.bridge.ports.Color;

public class Red implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}
