package com.java.oop.model;

import java.util.Objects;

public class Customer implements Comparable<Customer>{
    private int id;
    private String name;
    private String email;
    private String password;
    private long phoneNo;
    private boolean isActive;

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public Customer setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Customer setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Customer setPassword(String password) {
        this.password = password;
        return this;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public Customer setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }

    public boolean isActive() {
        return isActive;
    }

    public Customer setActive(boolean active) {
        isActive = active;
        return this;
    }

    //equals and hashcode


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && phoneNo == customer.phoneNo && isActive == customer.isActive && Objects.equals(name, customer.name) && Objects.equals(email, customer.email) && Objects.equals(password, customer.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, password, phoneNo, isActive);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +

                '}';
    }

    @Override
    public int compareTo(Customer customer) {
        return customer.name.compareTo(this.name);
    }
}
