package com.example.productskeycloak.web;

import com.example.productskeycloak.repositories.ProductRepository;
import com.example.productskeycloak.required.SupplierService;
import com.example.productskeycloak.web.dto.Supplier;
import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;
import org.keycloak.adapters.springsecurity.client.KeycloakRestTemplate;
import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ProductController{
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/products")
    public String products(Model model){
        model.addAttribute("products",productRepository.findAll());
        return "products";
    }


    @Autowired
    private SupplierService supplierService;

    @GetMapping("/suppliers")
    public String suppliers(Model model){
        model.addAttribute("suppliers",supplierService.findAll());
        return "suppliers";
    }

}
