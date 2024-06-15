import model.Product;
import service.CartService;
import service.CartServiceImpl;

public class OnlineShoppingMain {

    public static void main(String[] args) {

        // Create some products

        Product p1 = new Product(1,"iPhone15","Apple iPhone 15 128GB",75000);
        Product p2 = new Product(2,"Samsung Galaxy S20","Samsung Galaxy S20 128GB",65000);
        Product p3 = new Product(3,"One Plus 8","One Plus 8 128GB",55000);
        Product p4 = new Product(4,"Google Pixel 4","Google Pixel 4 128GB",45000);
        Product p5 = new Product(5,"Xiaomi Redmi Note 9 Pro","Xiaomi Redmi Note 9 Pro 128GB",25000);

        // Add Product to cart

        CartService cartService = new CartServiceImpl();

        cartService.addToCart(p1);
        cartService.addToCart(p4);
        cartService.addToCart(p1);
        cartService.addToCart(p4);
        cartService.addToCart(p1);
        cartService.addToCart(p4);
        cartService.addToCart(p1);
        cartService.addToCart(p4);
        cartService.addToCart(p1);
        cartService.addToCart(p4);
        cartService.addToCart(p1);
        cartService.addToCart(p4);
        cartService.addToCart(p1);
        cartService.addToCart(p4);

        // Display the cart details

        cartService.displayCartDetails();


    }

}
