package com.java.oop.collection.list;

import com.java.oop.model.Customer;

public class CustomerService {
    public void displayCustomer(Customer customer){
        System.out.println("Id : " + customer.getId() );
        System.out.println("Name : " + customer.getName() );
        System.out.println("Email : " + customer.getEmail() );
        System.out.println("Phone No : " + customer.getPhoneNo() );
        System.out.println("Active : " + customer.isActive() );
    }
}
