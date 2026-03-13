package com.java.oop.inheritance;

public class Main {
    public static void main(String[] args) {
      /*  Product product = new Product("p-001", "Product A", 100.0, 0.1f, 4.5f, 100, true);
        product.displayProductDetails();*/
        Laptop laptop = new Laptop();
        System.out.println(laptop.id);
        System.out.println(laptop.processor);
        System.out.println(laptop.operatingSystem);

        Laptop laptop2 = new Laptop("l-001", "Laptop A", 1000.0, 0.1f, 4.5f, 100, true, "Windows", "Intel i5");
        System.out.println(laptop2.id);
        laptop2.displayLaptopDetails();

        Book book1 = new Book("b-101", "Book A", 50.0, 0.05f, 4.0f, 50, true, "Author A", "Publisher A");

        book1.displayBookDetails();
    }
}
