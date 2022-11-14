/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wp.springmvc.exception;

/**
 *
 * @author Blandus
 */
public class ProductNotFoundException extends RuntimeException{

  private static final long serialVersionUID =-694354952032299587L;

  private String productId;

  public ProductNotFoundException(String productId) {
    this.productId =  productId;
  }

  public String getProductId() {
    return productId;
  }

}
