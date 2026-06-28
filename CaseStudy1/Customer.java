package CaseStudy;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private Cart cart;
    private List<Order> orderHistory;

    public Customer(String name) {
        this.name = name;
        this.cart = new Cart();
        this.orderHistory = new ArrayList<>();
    }

    public void browseProducts() {
        System.out.println("Browsing products by category...");
        // Code to browse products by category
    }

    public void searchProducts(String keyword) {
        System.out.println("Searching for products with keyword: " + keyword);
        // Code to search products by name, category, or price range
    }

    public void addToCart(Product product) {
        cart.addProduct(product);
    }

    public void viewCart() {
        cart.viewCart();
    }

    public void checkout() {
        Order order = new Order(cart.getProducts());
        orderHistory.add(order);
        cart.clearCart();
        System.out.println("Checkout complete. Order placed.");
    }

    public void viewOrderHistory() {
        System.out.println("Order History:");
        for (Order order : orderHistory) {
            order.viewOrder();
        }
    }
}
