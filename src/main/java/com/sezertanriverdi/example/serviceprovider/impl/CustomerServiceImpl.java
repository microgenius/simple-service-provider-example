package com.sezertanriverdi.example.serviceprovider.impl;

import com.sezertanriverdi.example.serviceprovider.base.InjectableService;
import com.sezertanriverdi.example.serviceprovider.model.Customer;
import com.sezertanriverdi.example.serviceprovider.type.ICustomerRepository;
import com.sezertanriverdi.example.serviceprovider.type.ICustomerService;

public class CustomerServiceImpl extends InjectableService implements ICustomerService {
    private final ICustomerRepository customerRepository;

    public CustomerServiceImpl() {
        // No-args constructor is required by ServiceLoader,
        // We need to find the implementation of ICustomerRepository explicitly
        this.customerRepository = injectOrFail(ICustomerRepository.class);
    }

    @Override
    public long createCustomer(final Customer customer) {
        System.out.println("CustomerServiceImpl: Customer creating...");
        return customerRepository.save(customer);
    }
}
