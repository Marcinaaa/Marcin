package com.it.academy;

public class Carpet {
    double area;
    Circle circle = new Circle();
    Rectangle rectangle = new Rectangle();
    Square square = new Square();
Shape[] shape = {circle, rectangle, square};

    public double AddSquare(){
        return area+=square.getArea();
    }
    public double AddCircle(){
        return area+=circle.getArea();
    }
    public double AddRectangle(){
        return area+=rectangle.getArea();
    }
}
