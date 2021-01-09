package com.kodilla.good.patterns.challenges.allegro.services;

import com.kodilla.good.patterns.challenges.allegro.orders.OrderRequest;

public class ProductOrderService {

    public boolean orderProduct(OrderRequest orderRequest) {
        double totalPrice = orderRequest.getQuantity() * orderRequest.getProduct().getProductPrice();

        System.out.println("-------------------------------------------------------------------");
        System.out.println("Ordering product: " + orderRequest.getProduct().getProductName() + ", for: " +
                orderRequest.getUser().getNickname() + ". times: " +
                orderRequest.getQuantity() + ", Total Price: " + totalPrice);

        return true;
    }
}
