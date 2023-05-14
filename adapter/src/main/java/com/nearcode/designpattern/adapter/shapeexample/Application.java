package com.nearcode.designpattern.adapter.shapeexample;

public class Application {
    public static void main(String[] args) {
        LegacyShapeLibrary legacyShape = new LegacyShapeLibrary();
        ShapeAdapter shapeAdapter = new ShapeAdapter(legacyShape);

        // Use the adapter to draw and resize the shape
        shapeAdapter.draw();
        shapeAdapter.resize();
    }
}
