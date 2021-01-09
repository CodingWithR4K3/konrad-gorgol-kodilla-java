package com.kodilla.good.patterns.challenges.allegro.products;

import com.kodilla.good.patterns.challenges.allegro.orders.Order;
import com.kodilla.good.patterns.challenges.allegro.orders.OrderRepository;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ProductOrderRepository implements OrderRepository {

    private final Map<String, Order> orders = new HashMap<>();
    private LocalDate lastOrderDate = LocalDate.now();
    private Integer currentDayOrderNumber = 0;

    @Override
    public void createOrder(final Order order, final LocalDate localDate) {
        if (lastOrderDate.equals(localDate)) {
            currentDayOrderNumber++;
        } else if (lastOrderDate.isBefore(localDate)) {
            currentDayOrderNumber = 0;
            lastOrderDate = localDate;
        }
        String currentOrderId = localDate.toString().replace("-", "") + currentDayOrderNumber;
        orders.put(currentOrderId, order);
    }

    public void showOrder() {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("\nOrders in repository: ");

        for (Map.Entry<String, Order> currentEntry : orders.entrySet()) {
            System.out.println("Order ID: " + currentEntry.getKey() +
                    " Ordered product: " + currentEntry.getValue().getProduct().getProductName() +
                    " Ordered by: " + currentEntry.getValue().getUser().getFirstname() + " " +
                    currentEntry.getValue().getUser().getSurname());
        }
        System.out.println("-------------------------------------------------------------------");
    }
}