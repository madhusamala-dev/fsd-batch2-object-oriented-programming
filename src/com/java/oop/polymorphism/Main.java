package com.java.oop.polymorphism;



public class Main {
    public static void main(String[] args) {
        Product product = new Product("p-001", "Product A", 100.0, 0.1f, 4.5f, 100, true);
        ProductService productService = new ProductService();
        productService.displayDetails(product);

        Laptop laptop = new Laptop("l-001", "Laptop A", 1000.0, 0.1f, 4.5f, 100, true, "Windows", "Intel i5");
        productService.displayDetails(laptop);

        Book book = new Book("b-101", "Book A", 50.0, 0.05f, 4.0f, 50, true, "Author A", "Publisher A");
        productService.displayDetails(book);
    }
}
