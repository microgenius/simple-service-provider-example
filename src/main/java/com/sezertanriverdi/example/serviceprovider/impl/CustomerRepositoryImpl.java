package com.sezertanriverdi.example.serviceprovider.impl;

import java.util.Random;

import com.google.auto.service.AutoService;
import com.sezertanriverdi.example.serviceprovider.base.InjectableService;
import com.sezertanriverdi.example.serviceprovider.model.Customer;
import com.sezertanriverdi.example.serviceprovider.type.ICustomerRepository;

/**
 * @author sezertanriverdi
 *
 * AutoService annotation is used to generate a resource file to load class with ServiceLoader class.
 * You don't have to use this annotation to load the service with ServiceLoader.
 * But if you don't use this annotation, you need to create a resource file manually.
 *
 * Please see META-INF/services/com.sezertanriverdi.example.serviceprovider.type.ICustomerService
 */
@AutoService(ICustomerRepository.class)
public class CustomerRepositoryImpl extends InjectableService implements ICustomerRepository {
    private static final Random RANDOM_ID_GENERATOR = new Random();

    @Override
    public long save(final Customer customer) {
        System.out.println("CustomerRepositoryImpl: Saving customer into DB: " + customer);
        return RANDOM_ID_GENERATOR.nextLong();
    }
}
