package com.example.productskeycloak.required.impl;
import com.example.productskeycloak.required.SupplierService;
import com.example.productskeycloak.web.dto.Supplier;
import org.keycloak.adapters.springsecurity.client.KeycloakRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private KeycloakRestTemplate keycloakRestTemplate;

    @Override
    public List<Supplier> findAll() {
        return keycloakRestTemplate.getForObject("http://localhost:8082/suppliers/", List.class);
    }
}
