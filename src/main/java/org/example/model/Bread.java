package org.example.model;

public class Bread extends ProductForSale {
    private String flourType;

    public Bread(String type, double price, String description, String flourType) {
        super(type, price, description);
        this.flourType = flourType;
    }
    public Bread(String type, double price, String description ) {
        super(type, price, description);

    }


    public String getFlourType() {
        return flourType;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Flour Type: " + getFlourType());
    }
}
