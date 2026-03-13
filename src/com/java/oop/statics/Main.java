package com.java.oop.statics;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("P001", "Laptop", 1200.0, 10.0f);
       // Product.COMPANY_NAME = "ABC Company";
        System.out.println("Product ID: " + product.id);
        System.out.println("Product Name: " + product.name);
        System.out.println("Max Retail Price: $" + product.maxRetailPrice);
        System.out.println("Discount Percentage: " + product.discountPercentage + "%");
        System.out.println("Company Name: " + Product.COMPANY_NAME);

        System.out.println("Company Name " + product.COMPANY_NAME);
       // product.companyName = "XYZ Company";
        System.out.println("Company Name " + Product.COMPANY_NAME);

        Product.displayCompanyDetails();
     }
}
