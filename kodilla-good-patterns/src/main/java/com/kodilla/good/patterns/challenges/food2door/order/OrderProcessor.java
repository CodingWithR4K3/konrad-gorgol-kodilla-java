package com.kodilla.good.patterns.challenges.food2door.order;

import com.kodilla.good.patterns.challenges.food2door.manufacturers.Manufacturer;
import com.kodilla.good.patterns.challenges.food2door.products.ProductRepository;

public class OrderProcessor {

    private final ProductRepository productRepository;

    public OrderProcessor(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProcessOrderDto processOrder(OrderRequest orderRequest) {

        Manufacturer manufacturer = productRepository.getProductDeliverer(orderRequest.getProductId());

        boolean ifOrdered = manufacturer.process(productRepository.getProductFromRepository(orderRequest.getProductId()), orderRequest.getQuantity());
        return new ProcessOrderDto(orderRequest, ifOrdered);
    }
}
