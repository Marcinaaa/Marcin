package com.it.academy;

public class Book {
    String name;
    String author;
    double price;
    int qty;

    public Book (String name, Author author, double price) {

    }

    public Book (String name, Author author, double price, int qty) {

    }

    public String getName() {
        return name;
    }

    public String getAuthor() {

        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

}
