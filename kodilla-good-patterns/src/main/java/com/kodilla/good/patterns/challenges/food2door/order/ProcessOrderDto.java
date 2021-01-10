package com.kodilla.good.patterns.challenges.food2door.order;

public class ProcessOrderDto {

    private final OrderRequest orderRequest;
    private final boolean ifOrdered;

    public ProcessOrderDto(OrderRequest orderRequest, boolean ifOrdered) {
        this.orderRequest = orderRequest;
        this.ifOrdered = ifOrdered;
    }

    public void showOrderStatus() {
        System.out.println("Is product: " + orderRequest.getProduct().getProductName() + " ordered? " + ifOrdered);
    }
}
