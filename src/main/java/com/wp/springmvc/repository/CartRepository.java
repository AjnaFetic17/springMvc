/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wp.springmvc.repository;

import com.wp.springmvc.domain.Cart;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Blandus
 */
@Repository
public interface CartRepository {

    Cart create(Cart cart);

    Cart read(String cartId);

    void update(String cartId, Cart cart);

    void delete(String cartId);

}
