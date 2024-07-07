package service;

import model.Cart;
import model.Product;

public interface CartService {

    public int addToCart(Product product);

    public void displayCartDetails();

}
