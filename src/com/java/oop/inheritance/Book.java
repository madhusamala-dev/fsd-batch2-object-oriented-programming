package com.java.oop.inheritance;

public class Book extends Product{
    String author;
    String publisher;

    public Book(){
        super();
    }
    public Book(String id, String name, double maxRetailPrice, float discountPercentage, float rating, int reviewCount, boolean isStockAvailable, String author, String publisher) {
        super(id, name, maxRetailPrice, discountPercentage, rating, reviewCount, isStockAvailable);
        this.author = author;
        this.publisher = publisher;
    }
    public void displayBookDetails(){
        super.displayProductDetails();
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
    }
}
