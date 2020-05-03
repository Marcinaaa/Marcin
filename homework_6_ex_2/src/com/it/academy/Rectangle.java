package com.it.academy;

public class Rectangle extends  Shape{
    private double width = 3;
    private double hight = 2;

    @Override
    double getArea() {
        return width*hight;
    }
}
