package com.nearcode.designpattern.adapter.shapeexample;

// Adapter class
class ShapeAdapter implements Shape {
    private LegacyShapeLibrary legacyShape;

    public ShapeAdapter(LegacyShapeLibrary legacyShape) {
        this.legacyShape = legacyShape;
    }

    @Override
    public void draw() {
        // Convert the modern draw() method to the legacy format
        legacyShape.drawShape(0, 0, 100, 100);
    }

    @Override
    public void resize() {
        // Implement the resize() method as per the modern interface
        System.out.println("Resizing the shape");
    }
}
