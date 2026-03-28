package com.java.oop.exception;

public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(){
        this.customerService = new CustomerService();
    }

    public Customer save(Customer customer) throws CustomerExistsException {
        return customerService.save(customer);
    }
    public Customer findById(int id){
        return customerService.findById(id);
    }
}
