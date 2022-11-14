/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wp.springmvc.services.impl;

import com.wp.springmvc.domain.Product;
import com.wp.springmvc.repository.ProductRepository;
import com.wp.springmvc.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Blandus
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductRepository _productRepository;
    
    @Override
    public void processOrder(String productId, int count) {
        Product productById = _productRepository.getProductById(productId);
        
        if(productById.getUnitsInStock()<count){
            throw new IllegalArgumentException("Out of stock. Available Units in stock: "+productById.getUnitsInStock());
        }
        
        productById.setUnitsInStock(productById.getUnitsInStock()-count);
    }
    
}
