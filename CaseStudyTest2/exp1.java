package CaseStudyTest2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Product {
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

class ShoppingCart {
    private Map<Product, Integer> items;

    public ShoppingCart() {
        items = new HashMap<>();
    }

    public void addItem(Product product) {
        if (items.containsKey(product)) {
            items.put(product, items.get(product) + 1);
        } else {
            items.put(product, 1);
        }
    }

    public void removeItem(Product product) {
        if (items.containsKey(product)) {
            items.remove(product);
        }
    }

    public void updateQuantity(Product product, int quantity) {
        if (items.containsKey(product)) {
            items.put(product, quantity);
        }
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            totalPrice += entry.getKey().getPrice() * entry.getValue();
        }
        return totalPrice;
    }

    public void viewCart() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Your cart contains:");
            for (Map.Entry<Product, Integer> entry : items.entrySet()) {
                System.out.println(entry.getKey().getName() + " (Quantity: " + entry.getValue() + ")");
            }
            System.out.println("Total price: $" + getTotalPrice());
        }
    }
}

class OnlineShoppingSystem {
    private List<Product> products;
    private ShoppingCart cart;

    public OnlineShoppingSystem() {
        products = new ArrayList<>();
        cart = new ShoppingCart();
        // Initialize products for testing
        products.add(new Product("Laptop", "Electronics", 1200.0));
        products.add(new Product("Phone", "Electronics", 800.0));
        products.add(new Product("Shirt", "Clothing", 30.0));
        products.add(new Product("Shoes", "Clothing", 70.0));
    }

    public void browseProducts() {
        System.out.println("Available products:");
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println((i + 1) + ". " + product.getName() + " (Category: " + product.getCategory() + ", Price: $" + product.getPrice() + ")");
        }
    }

    public void searchProducts(String query) {
        System.out.println("Search results for '" + query + "':");
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(query.toLowerCase()) ||
                product.getCategory().toLowerCase().contains(query.toLowerCase())) {
                System.out.println(product.getName() + " (Category: " + product.getCategory() + ", Price: $" + product.getPrice() + ")");
            }
        }
    }

    public void addToCart(int productIndex) {
        if (productIndex >= 1 && productIndex <= products.size()) {
            Product product = products.get(productIndex - 1);
            cart.addItem(product);
            System.out.println(product.getName() + " added to cart.");
        } else {
            System.out.println("Invalid product index.");
        }
    }

    public void removeFromCart(int productIndex) {
        if (productIndex >= 1 && productIndex <= products.size()) {
            Product product = products.get(productIndex - 1);
            cart.removeItem(product);
            System.out.println(product.getName() + " removed from cart.");
        } else {
            System.out.println("Invalid product index.");
        }
    }

    public void updateQuantity(int productIndex, int quantity) {
        if (productIndex >= 1 && productIndex <= products.size()) {
            Product product = products.get(productIndex - 1);
            cart.updateQuantity(product, quantity);
            System.out.println("Quantity of " + product.getName() + " updated to " + quantity + ".");
        } else {
            System.out.println("Invalid product index.");
        }
    }

    public void viewCart() {
        cart.viewCart();
    }

    public void checkout() {
        System.out.println("Checkout completed. Thank you for your purchase!");
    }

    public static void main(String[] args) {
        OnlineShoppingSystem system = new OnlineShoppingSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOnline Shopping System Menu:");
            System.out.println("1. Browse Products");
            System.out.println("2. Search Products");
            System.out.println("3. Add to Cart");
            System.out.println("4. Remove from Cart");
            System.out.println("5. Update Quantity");
            System.out.println("6. View Cart");
            System.out.println("7. Checkout");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    system.browseProducts();
                    break;
                case 2:
                    System.out.print("Enter search query: ");
                    String query = scanner.nextLine();
                    system.searchProducts(query);
                    break;
                case 3:
                    system.browseProducts();
                    System.out.print("Enter product index to add: ");
                    int productIndex = scanner.nextInt();
                    system.addToCart(productIndex);
                    break;
                case 4:
                    system.browseProducts();
                    System.out.print("Enter product index to remove: ");
                    productIndex = scanner.nextInt();
                    system.removeFromCart(productIndex);
                    break;
                case 5:
                    system.browseProducts();
                    System.out.print("Enter product index to update quantity: ");
                    productIndex = scanner.nextInt();
                    System.out.print("Enter new quantity: ");
                    int quantity = scanner.nextInt();
                    system.updateQuantity(productIndex, quantity);
                    break;
                case 6:
                    system.viewCart();
                    break;
                case 7:
                    system.checkout();
                    break;
                case 8:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}