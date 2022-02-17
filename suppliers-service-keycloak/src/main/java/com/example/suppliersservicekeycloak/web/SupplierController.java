package com.example.suppliersservicekeycloak.web;

import com.example.suppliersservicekeycloak.entities.Supplier;
import com.example.suppliersservicekeycloak.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("suppliers")
public class SupplierController {
    @Autowired
    private SupplierRepository supplierRepository;
    @GetMapping("/")
    public List<Supplier> findAll(){
          return supplierRepository.findAll();
    }
}
