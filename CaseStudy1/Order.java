package CaseStudy;

import java.util.List;

class Order {
    private List<Product> products;

    public Order(List<Product> products) {
        this.products = products;
    }

    public void viewOrder() {
        System.out.println("Order Details:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
