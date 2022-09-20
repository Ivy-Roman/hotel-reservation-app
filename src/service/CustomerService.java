package service;

import model.Customer;

import java.util.Collection;

public class CustomerService {
    public void addCustomer(String email, String firstName, String lastName){}
    public Customer getCustomer(String customerEmail){
        return null;
    }
    public Collection<Customer> getAllCustomers(){
        return null;
    }

    static <T> void displayCustomer(T variable){
        System.out.println(variable.getClass().getName());
    }
}