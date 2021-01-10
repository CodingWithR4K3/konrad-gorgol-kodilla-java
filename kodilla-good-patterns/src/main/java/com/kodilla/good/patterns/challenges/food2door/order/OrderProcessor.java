package com.kodilla.good.patterns.challenges.food2door.order;

import com.kodilla.good.patterns.challenges.food2door.manufacturers.Manufacturer;
import com.kodilla.good.patterns.challenges.food2door.products.ProductRepository;

public class OrderProcessor {

    private final ProductRepository productRepository;

    public OrderProcessor(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProcessOrderDto processOrder(OrderRequest orderRequest) {

        Manufacturer manufacturer = productRepository.getProductDeliverer(orderRequest.getProduct());

        boolean ifOrdered = manufacturer.process(orderRequest.getProduct(), orderRequest.getQuantity());
        return new ProcessOrderDto(orderRequest, ifOrdered);
    }
}
