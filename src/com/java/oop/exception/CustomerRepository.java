package com.java.oop.exception;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {

    private final List<Customer> customers;

    public CustomerRepository(){
        this.customers = new ArrayList<>();
    }

    public Customer save(Customer customer){
        customers.add(customer);
        return customer;
    }

    public List<Customer> findAll(){
        return customers;
    }
    public Customer findById(int id){
        for(Customer customer : customers){
            if(customer.getId() == id){
                return customer;
            }
        }
        return null;
    }

}
