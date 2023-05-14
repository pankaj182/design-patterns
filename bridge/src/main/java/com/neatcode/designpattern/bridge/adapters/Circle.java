package com.neatcode.designpattern.bridge.adapters;

import com.neatcode.designpattern.bridge.ports.Color;
import com.neatcode.designpattern.bridge.ports.Shape;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
        color.applyColor();
    }
}
