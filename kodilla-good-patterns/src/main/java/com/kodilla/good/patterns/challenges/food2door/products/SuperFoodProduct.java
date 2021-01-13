package com.kodilla.good.patterns.challenges.food2door.products;


public class SuperFoodProduct implements Product {

    private final String productName;
    private final double productPrice;
    private final boolean isGlutenFree;
    private final int productId;


    public SuperFoodProduct(int productId, String productName, double productPrice, boolean isGlutenFree) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.isGlutenFree = isGlutenFree;
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public Integer productId() {
        return productId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SuperFoodProduct that = (SuperFoodProduct) o;

        if (Double.compare(that.productPrice, productPrice) != 0) return false;
        if (isGlutenFree != that.isGlutenFree) return false;
        return productName.equals(that.productName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = productName.hashCode();
        temp = Double.doubleToLongBits(productPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isGlutenFree ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product number" + "|" +
                "Product name is: " + productName + "|" +
                "Product price: " + productPrice + "|" +
                "Is gluten free: " + isGlutenFree;
    }
}