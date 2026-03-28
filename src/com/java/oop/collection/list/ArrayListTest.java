package com.java.oop.collection.list;

import com.java.oop.model.Customer;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Customer> customersList = new ArrayList<>();
        Customer customer1 = new Customer();
        customer1.setId(103).setName("John").setEmail("customer3@gmail.com").setPhoneNo(9876543210L).setActive(true).setPassword("Abcd@1234");
        Customer customer2 = new Customer();
        customer2.setId(102).setName("Alice").setEmail("customer2@gmail.com").setPhoneNo(9876543210L).setActive(false).setPassword("hello@1234");
        Customer customer3 = new Customer();
        customer3.setId(101).setName("Madhu Samala").setEmail("customer1@gmail.com").setPhoneNo(9876543210L).setActive(true).setPassword("Abcd@1234");
        Customer customer4 = new Customer();
        customer4.setId(101).setName("Madhu Samala").setEmail("customer1@gmail.com").setPhoneNo(9876543210L).setActive(true).setPassword("Abcd@1234");
        customersList.add(customer1);
        customersList.add(customer2);
        customersList.add(customer3);
        customersList.add(customer4);
        System.out.println(customersList);
        CustomerService customerService = new CustomerService();
        for(Customer customer : customersList){
            customerService.displayCustomer(customer);
        }
    }
}
