/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wp.springmvc.services;

import com.wp.springmvc.domain.Product;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Blandus
 */
@Service
public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(String productID);
    
    //Za kategorije dio
    List<Product> getProductsByCategory(String category);
    
    //za spring tags
    void addProduct(Product product);
}
