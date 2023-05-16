package com.neatcode.designpattern.bridge;

import com.neatcode.designpattern.bridge.adapters.*;
import com.neatcode.designpattern.bridge.ports.Color;
import com.neatcode.designpattern.bridge.ports.Shape;

public class Application {
    public static void main(String[] args) {
        Color red = new Red();
        Color green = new Green();
        Color blue = new Blue();

        Shape circle = new Circle(red);
        circle.draw();

        Shape square = new Square(green);
        square.draw();

        Shape triangle = new Triangle(blue);
        triangle.draw();
    }
}
