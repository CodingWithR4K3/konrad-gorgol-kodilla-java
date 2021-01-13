package com.kodilla.good.patterns.challenges.food2door.manufacturers;

import com.kodilla.good.patterns.challenges.food2door.products.Product;

import java.util.ArrayDeque;
import java.util.Queue;

public class HealthyShop implements Manufacturer {

    private final static Queue<String> nextToHandleQueue = new ArrayDeque<>();

    public boolean process(final Product product, final int quantity) {

        System.out.println("Stay Healthy, be Healthy! It's HealthyShop!\nI am adding order to queue");
        return nextToHandleQueue.offer(product.getProductName() + ", qty: " + quantity);
    }
}
