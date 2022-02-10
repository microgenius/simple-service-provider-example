package com.sezertanriverdi.example.serviceprovider;

import java.util.Optional;
import java.util.ServiceLoader;

import com.sezertanriverdi.example.serviceprovider.model.Customer;
import com.sezertanriverdi.example.serviceprovider.type.ICustomerService;

public class Main {
    public static void main(String[] args) {
        final Optional<ICustomerService> customerServiceOptional = ServiceLoader.load(ICustomerService.class)
            .findFirst();

        customerServiceOptional.ifPresent(customerService -> {
            final Customer customer = new Customer("John Doe", "johndoe@mail.com", "123456789");
            final long customerId = customerService.createCustomer(customer);
            System.out.println("Main: Customer created with id: " + customerId);
        });
    }
}
