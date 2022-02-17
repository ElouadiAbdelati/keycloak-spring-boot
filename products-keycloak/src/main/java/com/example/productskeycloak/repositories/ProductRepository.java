package com.example.productskeycloak.repositories;

import com.example.productskeycloak.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
