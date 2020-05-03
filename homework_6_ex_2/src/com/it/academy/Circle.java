package com.it.academy;

import static java.lang.Math.PI;

public class Circle extends Shape {
    private double radius = 2;

    @Override
    double getArea() {
        return PI*radius*radius;
    }
}
