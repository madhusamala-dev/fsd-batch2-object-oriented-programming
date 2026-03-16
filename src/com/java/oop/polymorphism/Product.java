package com.java.oop.polymorphism;

public class Product {
    String id;
    String name;
    double maxRetailPrice;
    float discountPercentage;
    float rating;
    int reviewCount;
    boolean isStockAvailable;

    public Product() {
        System.out.println("Product() constructor called");
    }
    public Product(String id, String name, double maxRetailPrice, float discountPercentage, float rating, int reviewCount, boolean isStockAvailable) {
        System.out.println("Product(String id, String name, double maxRetailPrice, float discountPercentage, float rating, int reviewCount, boolean isStockAvailable) constructor called");
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
        this.reviewCount = reviewCount;
        this.isStockAvailable = isStockAvailable;
    }

    public void displayDetails(){
        System.out.println("4");
        System.out.println("Product Details: ");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Max Retail Price: " + maxRetailPrice);
        System.out.println("Discount Percentage: " + discountPercentage);
        System.out.println("Rating: " + rating);
        System.out.println("Review Count: " + reviewCount);
        System.out.println("Is Stock Available: " + isStockAvailable);
    }
}
