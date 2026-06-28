package CaseStudy;

import java.util.ArrayList;
import java.util.List;

class Cart {
    private List<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to the cart.");
    }

    public void viewCart() {
        System.out.println("Shopping Cart:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public void clearCart() {
        products.clear();
    }
}
