package com.java.oop.exception;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(101)
                .setName("John Doe")
                .setEmail("john.doe@example.com")
                .setPhoneNo("123-456-7890");

        CustomerController controller = new CustomerController();
        Customer savedCustomer = null;
        try {
            savedCustomer = controller.save(customer);
            System.out.println("Customer saved successfully: " + savedCustomer.getName());

        } catch (CustomerExistsException e) {
            System.out.println(e.getMessage());;
        }

        Customer customer2 = new Customer();
        customer2.setId(101)
                .setName("John Abraham")
                .setEmail("john.abraham@example.com")
                .setPhoneNo("123-456-7890");
        try {
            savedCustomer = controller.save(customer2);
            System.out.println("Customer saved successfully: " + savedCustomer.getName());
        } catch (CustomerExistsException e) {
            System.out.println(e.getMessage());;
        }

    }
}
