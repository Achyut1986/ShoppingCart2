package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShoppingCartLab {
    @Test
    void emptyCart(){
    Cart cart= new Cart();
    assertTrue(cart.isEmpty());
    }

}
