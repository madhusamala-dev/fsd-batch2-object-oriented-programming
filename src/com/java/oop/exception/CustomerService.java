package com.java.oop.exception;

public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(){
        this.customerRepository = new CustomerRepository();
    }

    public Customer save(Customer customer) throws CustomerExistsException {
        //check if customer already exists
        // throw CustomerAlreadyExistException
        if(customerRepository.findById(customer.getId()) != null){
            throw new CustomerExistsException("Customer with id " + customer.getId() + " already exists");
        } else {
            return customerRepository.save(customer);
        }


    }

    public Customer findById(int id){
        //if customer not found
        //throw CustomerNotFoundException
        return customerRepository.findById(id);
    }
}
