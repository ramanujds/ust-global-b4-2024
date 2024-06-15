package model;

import java.util.Arrays;

public class Cart {

    private Product []products;

    private float totalValue;

    public Cart() {
        this.products = new Product[10];
        totalValue=0;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public float getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(float totalValue) {
        this.totalValue = totalValue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cart{");
        sb.append("products=").append(Arrays.toString(products));
        sb.append(", totalValue=").append(totalValue);
        sb.append('}');
        return sb.toString();
    }
}
