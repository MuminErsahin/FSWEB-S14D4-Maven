package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = {
                new Chocolate("Chocolate", 2.99, "Dark Chocolate", 70),
                new Coke("Coke", 1.49, "Coca-Cola", false),
                new Bread("Bread", 1.99, "Whole Wheat Bread", "Whole Wheat")
        };

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println();
        }
    }
}
