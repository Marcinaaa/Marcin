package com.it.academy;

public class Square extends Shape{
    private double side = 2;

    @Override
    double getArea() {
        return side*side;
    }
}
