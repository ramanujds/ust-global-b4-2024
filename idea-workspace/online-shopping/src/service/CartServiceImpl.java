package service;

import model.Cart;
import model.Product;

public class CartServiceImpl implements CartService{

    private Cart cart;

    int totalItems;

    public CartServiceImpl() {
        cart = new Cart();
        totalItems=0;
    }

    @Override
    public void addToCart(Product product) {
        if(totalItems<cart.getProducts().length){
            cart.getProducts()[totalItems]=product;
            cart.setTotalValue(cart.getTotalValue()+product.getPrice());
            totalItems++;
            return;
        }
        System.err.println("Cart is Full");
    }

    @Override
    public void displayCartDetails() {
        System.out.println("Total Items : "+totalItems);
        System.out.println("Total Value : "+cart.getTotalValue());
        System.out.println("Products : ");
        for (int i=0; i<totalItems;i++){
            System.out.println(cart.getProducts()[i]);
        }


    }
}
