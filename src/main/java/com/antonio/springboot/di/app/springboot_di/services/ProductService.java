package com.antonio.springboot.di.app.springboot_di.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.antonio.springboot.di.app.springboot_di.models.Product;

@Component
public interface ProductService {
    public List<Product> findAll();

    public Product findById(Long id);

}
