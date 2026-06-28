package CaseStudyTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineShoppingSystems {

    private Map<String, List<Product>> productsByCategory = new HashMap<>();
    private Map<String, ShoppingCart> shoppingCarts = new HashMap<>();

    public void addProduct(Product product) {
        // Add product to the productsByCategory map
        String category = product.getCategory();
        if (!productsByCategory.containsKey(category)) {
            productsByCategory.put(category, new ArrayList<>());
        }
        productsByCategory.get(category).add(product);
    }

    public List<Product> browseProductsByCategory(String category) {
        return productsByCategory.getOrDefault(category, new ArrayList<>());
    }

    public List<Product> searchProducts(String query, String category, double priceRange) {
        List<Product> matchingProducts = new ArrayList<>();
        // Search products by name, category, and price range
        for (List<Product> productsInCategory : productsByCategory.values()) {
            for (Product product : productsInCategory) {
                if (product.getName().contains(query) && 
                    (category == null || product.getCategory().equals(category)) && 
                    (priceRange == 0 || product.getPrice() <= priceRange)) {
                    matchingProducts.add(product);
                }
            }
        }
        return matchingProducts;
    }

    public ShoppingCart getShoppingCart(String customerID) {
        if (!shoppingCarts.containsKey(customerID)) {
            shoppingCarts.put(customerID, new ShoppingCart());
        }
        return shoppingCarts.get(customerID);
    }

    public void addToCart(String customerID, Product product) {
        shoppingCarts.get(customerID).addItem(product);
    }

    public void removeFromCart(String customerID, Product product) {
        shoppingCarts.get(customerID).removeItem(product);
    }

    public void updateQuantity(String customerID, Product product, int quantity) {
        shoppingCarts.get(customerID).updateQuantity(product, quantity);
    }

    public List<Product> viewCart(String customerID) {
        return shoppingCarts.get(customerID).getItems();
    }

    public void checkout(String customerID, PaymentMethod paymentMethod) {
        // Process the checkout and payment
        ShoppingCart cart = shoppingCarts.get(customerID);
        // Implement payment processing logic here
        // ...
        cart.clear();
        // Update order history
        // ...
    }

    public List<Order> viewOrderHistory(String customerID) {
        // Retrieve order history from database or storage
        // ...
        List<Order> orderHistory = new ArrayList<>();
        // ...
        return orderHistory;
    }

    // Product class
    public static class Product {
        private String name;
        private String category;
        private double price;

        public Product(String name, String category, double price) {
            this.name = name;
            this.category = category;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getCategory() {
            return category;
        }

        public double getPrice() {
            return price;
        }
    }

    // ShoppingCart class
    public static class ShoppingCart {
        private List<Product> items = new ArrayList<>();

        public void addItem(Product product) {
            items.add(product);
        }

        public void removeItem(Product product) {
            items.remove(product);
        }

        public void updateQuantity(Product product, int quantity) {
            // Implement logic to update quantity of existing item
            // ...
        }

        public List<Product> getItems() {
            return items;
        }

        public void clear() {
            items.clear();
        }
    }

    // PaymentMethod class (represents different payment methods)
    public static class PaymentMethod {
        // Implement payment method properties and methods
        // ...
    }

    // Order class (represents an order placed by a customer)
    public static class Order {
        // Implement order properties and methods
        // ...
    }
}