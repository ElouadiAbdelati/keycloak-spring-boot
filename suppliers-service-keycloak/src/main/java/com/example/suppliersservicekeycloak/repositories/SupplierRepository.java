package com.example.suppliersservicekeycloak.repositories;

import com.example.suppliersservicekeycloak.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SupplierRepository extends JpaRepository<Supplier,Long> {
}
