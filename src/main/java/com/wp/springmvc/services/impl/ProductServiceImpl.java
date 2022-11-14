/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wp.springmvc.services.impl;

import com.wp.springmvc.domain.Product;
import com.wp.springmvc.repository.ProductRepository;
import com.wp.springmvc.services.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Blandus
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository _productRepository;
    
    @Override
    public List<Product> getAllProducts() {
        return _productRepository.getAllProducts();
    }

    @Override
    public Product getProductById(String productID) {
        return _productRepository.getProductById(productID);
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return _productRepository.getProductsByCategory(category);
    }

    @Override
    public void addProduct(Product product) {
        _productRepository.addProduct(product);
    }
    
}
