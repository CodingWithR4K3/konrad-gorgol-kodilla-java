package com.kodilla.good.patterns.challenges.food2door.manufacturers;

import com.kodilla.good.patterns.challenges.food2door.products.Product;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Manufacturer {

    private static final Map<String, Product> orders = new HashMap<>();

    public boolean process(final Product product, final int quantity) {

        System.out.println("<GlutenFreeShop> I am adding order to Map of Orders with unique order ID.");

        int initialOrdersMapSize = orders.size();
        String orderId = LocalDate.now().toString().replace("-", "") + LocalTime.now().toString().replace(":", "").replace(".", "");


        orders.put(orderId, product);
        System.out.println(orders);

        return orders.size() == ++initialOrdersMapSize;
    }
}