package com.sezertanriverdi.example.serviceprovider.base;

import java.util.ServiceLoader;

public class InjectableService {
    protected <T> T injectOrFail(Class<T> clazz) {
        return ServiceLoader.load(clazz)
            .findFirst()
            .orElseThrow(() -> new IllegalStateException("No service found for " + clazz.getName()));
    }
}
