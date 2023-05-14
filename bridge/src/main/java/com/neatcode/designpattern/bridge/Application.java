package com.neatcode.designpattern.bridge;

import com.neatcode.designpattern.bridge.adapters.Blue;
import com.neatcode.designpattern.bridge.adapters.Circle;
import com.neatcode.designpattern.bridge.adapters.Square;
import com.neatcode.designpattern.bridge.adapters.Green;
import com.neatcode.designpattern.bridge.adapters.Red;
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

        Shape blueSquare = new Square(blue);
        blueSquare.draw();
    }
}
