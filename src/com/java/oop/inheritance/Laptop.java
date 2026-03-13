package com.java.oop.inheritance;

public class Laptop extends Product{
    String operatingSystem;
    String processor;

    public Laptop(){
        super(); //super class constructor call
    }
    public Laptop(String id, String name, double maxRetailPrice, float discountPercentage, float rating, int reviewCount, boolean isStockAvailable, String operatingSystem, String processor) {
        super(id, name, maxRetailPrice, discountPercentage, rating, reviewCount, isStockAvailable);
        this.operatingSystem = operatingSystem;
        this.processor = processor;
    }

    public void displayLaptopDetails(){
       super.displayProductDetails();
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Processor: " + processor);
    }
}
