package com.kodilla.good.patterns.challenges.food2door.order;

public final class OrderRequest {

    private final int productId;
    private final int quantity;

    public OrderRequest(int productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }
}
