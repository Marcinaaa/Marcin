package com.it.academy;

public class Main {

    public static void main(String[] args) {
    Carpet carpet = new Carpet();
    carpet.AddSquare();
    carpet.AddCircle();
    carpet.AddCircle();
    carpet.AddRectangle();
    carpet.AddRectangle();

        System.out.println(carpet.area);
	// write your code here
    }
}
