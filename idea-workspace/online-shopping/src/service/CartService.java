package service;

import model.Product;

public interface CartService {

    public void addToCart(Product product);

    public void displayCartDetails();

}
