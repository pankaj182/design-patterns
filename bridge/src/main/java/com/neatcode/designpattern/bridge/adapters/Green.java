package com.neatcode.designpattern.bridge.adapters;

import com.neatcode.designpattern.bridge.ports.Color;

public class Green implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying green color");
    }
}
