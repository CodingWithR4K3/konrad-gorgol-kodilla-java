package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.order.OrderProcessor;
import com.kodilla.good.patterns.challenges.food2door.order.OrderRequest;
import com.kodilla.good.patterns.challenges.food2door.order.ProcessOrderDto;
import com.kodilla.good.patterns.challenges.food2door.products.ProductRepository;

public class Food2DoorApplication {
    public static void main(String[] args) {

        ProductRepository productRepository = new ProductRepository();

        OrderRequest orderRequest1 = new OrderRequest(1, 7);
        OrderRequest orderRequest2 = new OrderRequest(2, 10);
        OrderRequest orderRequest3 = new OrderRequest(3, 8);
        OrderRequest orderRequest4 = new OrderRequest(4, 7);

        OrderProcessor orderProcessor = new OrderProcessor(productRepository);

        ProcessOrderDto processOrderDto1 = orderProcessor.processOrder(orderRequest1);
        ProcessOrderDto processOrderDto2 = orderProcessor.processOrder(orderRequest2);
        ProcessOrderDto processOrderDto3 = orderProcessor.processOrder(orderRequest3);
        ProcessOrderDto processOrderDto4 = orderProcessor.processOrder(orderRequest4);

        processOrderDto1.showOrderStatus();
        processOrderDto2.showOrderStatus();
        processOrderDto3.showOrderStatus();
        processOrderDto4.showOrderStatus();
    }
}
