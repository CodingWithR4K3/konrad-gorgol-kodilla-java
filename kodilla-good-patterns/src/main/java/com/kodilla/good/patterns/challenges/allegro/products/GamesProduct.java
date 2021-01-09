package com.kodilla.good.patterns.challenges.allegro.products;

public class GamesProduct implements Product {

    private final String productName;
    private final double productPrice;

    public GamesProduct(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }
}
