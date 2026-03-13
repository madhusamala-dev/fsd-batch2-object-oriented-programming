package com.java.oop.statics;

public class Product {
    String id;
    String name;
    double maxRetailPrice;
    float discountPercentage;
    static final String COMPANY_NAME = "ABC Company";
    static final String COMPANY_ADDRESS = "123 Main St, City";
    static final String COMPANY_PHONE = "123-456-7890";

    public Product(String id, String name, double maxRetailPrice, float discountPercentage) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
    }

    public void displayProductDetails(){
        System.out.println("----------------------------------------------------------------- ");
        System.out.printf("%-10s %-30s %-15.2f %-15.2f\n", id, name, maxRetailPrice, discountPercentage);

    }

    public static void displayCompanyDetails(){
        System.out.println("Company Name: " + COMPANY_NAME);
        System.out.println("Company Address: " + COMPANY_ADDRESS);
        System.out.println("Company Phone: " + COMPANY_PHONE);

    }

}
