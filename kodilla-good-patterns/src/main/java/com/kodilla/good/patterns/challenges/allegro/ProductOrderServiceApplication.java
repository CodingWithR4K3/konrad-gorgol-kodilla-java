package com.kodilla.good.patterns.challenges.allegro;

import com.kodilla.good.patterns.challenges.allegro.orders.OrderDto;
import com.kodilla.good.patterns.challenges.allegro.orders.OrderProcessor;
import com.kodilla.good.patterns.challenges.allegro.orders.OrderRequest;
import com.kodilla.good.patterns.challenges.allegro.products.GamesProduct;
import com.kodilla.good.patterns.challenges.allegro.products.ProductOrderRepository;
import com.kodilla.good.patterns.challenges.allegro.services.MailInformationService;
import com.kodilla.good.patterns.challenges.allegro.services.ProductOrderService;
import com.kodilla.good.patterns.challenges.allegro.users.User;


public class ProductOrderServiceApplication {
    public static void main(String[] args) {

        OrderRequest orderRequest1 = new OrderRequest(new User("Marco", "Smith", "Smarc98"), new GamesProduct("Alienware ", 259.99), 1);
        OrderRequest orderRequest2 = new OrderRequest(new User("Sylvanas", "Windrunner", "Lady Moon"), new GamesProduct("Shadowlands ", 59.00), 2);

        ProductOrderRepository productOrderRepository = new ProductOrderRepository();
        OrderProcessor processor = new OrderProcessor(new ProductOrderService(), productOrderRepository, new MailInformationService());

        OrderDto orderDto1 = processor.process(orderRequest1);
        System.out.println("Did user " + orderDto1.getUser().getNickname() + " just ordered " + orderDto1.getProduct().getProductName() + "? " + orderDto1.isProductOrdered());

        OrderDto orderDto2 = processor.process(orderRequest2);
        System.out.println("Did user " + orderDto2.getUser().getNickname() + " just ordered " + orderDto2.getProduct().getProductName() + "? " + orderDto2.isProductOrdered());

        productOrderRepository.showOrder();

    }
}
