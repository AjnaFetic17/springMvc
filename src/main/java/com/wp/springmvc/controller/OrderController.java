/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wp.springmvc.controller;

import com.wp.springmvc.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Blandus
 */
@Controller
public class OrderController {
    @Autowired
    private OrderService _orderService;
    
    @RequestMapping("/order/P1234/2")
    public String process(){
        _orderService.processOrder("P1234", 2);
        return "redirect:/products";
    }
}
