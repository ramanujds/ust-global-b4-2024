package test.service;

import model.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.CartServiceImpl;

import java.util.Arrays;

public class CartServiceImplTest {
    CartServiceImpl cartService;

    @BeforeEach
    public void setUp(){
        cartService = new CartServiceImpl();
    }

    @Test
    public void testAddToCart(){
        Product product = new Product(101,"iPhone15","Apple iPhone15 Phone",78000);
        int total = cartService.getTotalItems();
        int updatedTotal = cartService.addToCart(product);

        Assertions.assertEquals(total+1,updatedTotal);
        Assertions.assertTrue(Arrays.asList(cartService.getCart().getProducts()).contains(product));
    }

}
