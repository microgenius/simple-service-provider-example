package com.sezertanriverdi.example.serviceprovider.type;

import com.sezertanriverdi.example.serviceprovider.model.Customer;

public interface ICustomerRepository {
    long save(Customer customer);
}
