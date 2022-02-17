package com.example.productskeycloak;

import com.example.productskeycloak.entities.Product;
import com.example.productskeycloak.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class ProductsKeycloakApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductsKeycloakApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            productRepository.save(new Product(null,"Computer",7600,34));
            productRepository.save(new Product(null,"Printer",1600,134));
            productRepository.save(new Product(null,"Smartphone",1600,34));
        };
    }
}
