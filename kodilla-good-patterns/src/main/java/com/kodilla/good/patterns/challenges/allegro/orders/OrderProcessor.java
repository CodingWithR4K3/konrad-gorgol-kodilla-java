package com.kodilla.good.patterns.challenges.allegro.orders;

import com.kodilla.good.patterns.challenges.allegro.services.InformationService;
import com.kodilla.good.patterns.challenges.allegro.services.ProductOrderService;

import java.time.LocalDate;

public class OrderProcessor {
    private final ProductOrderService productOrderService;
    private final OrderRepository orderRepository;
    private final InformationService informationService;

    public OrderProcessor(ProductOrderService productOrderService, OrderRepository orderRepository, InformationService informationService) {
        this.productOrderService = productOrderService;
        this.orderRepository = orderRepository;
        this.informationService = informationService;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = productOrderService.orderProduct(orderRequest);
        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest, LocalDate.now());
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), false);
        }
    }
}
