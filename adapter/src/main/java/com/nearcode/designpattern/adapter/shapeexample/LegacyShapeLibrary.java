package com.nearcode.designpattern.adapter.shapeexample;

public class LegacyShapeLibrary {
    void drawShape(int x1, int y1, int x2, int y2) {
        System.out.println("Drawing shape at (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ")");
    }
}
