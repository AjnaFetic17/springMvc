/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wp.springmvc.repository;

import com.wp.springmvc.domain.Product;
import java.util.List;

/**
 *
 * @author Blandus
 */
public interface ProductRepository {
    //Prvo ovo pa controller
    List<Product> getAllProducts();
    //Pa ovo za orderService
    Product getProductById(String productId);
    //Za prikaz po kategorijama pt 3
    List<Product> getProductsByCategory(String category);
    
    //za spring tag lib 
    void addProduct(Product product);
}
