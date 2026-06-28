package CaseStudy;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        // Example usage
        Customer customer = new Customer("John Doe");
        Product product1 = new Product("Laptop", "Electronics", 1000.00);
        Product product2 = new Product("Headphones", "Electronics", 50.00);

        customer.browseProducts();
        customer.searchProducts("Laptop");
        customer.addToCart(product1);
        customer.addToCart(product2);
        customer.viewCart();
        customer.checkout();
        customer.viewOrderHistory();
    }  
}
