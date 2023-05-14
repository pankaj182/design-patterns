package com.neatcode.designpattern.bridge.ports;

import com.neatcode.designpattern.bridge.ports.Color;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
