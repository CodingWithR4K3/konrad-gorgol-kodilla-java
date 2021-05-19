package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderWatcher.class);

    @Before(value = "execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" + "&& args(orderDto,userId)", argNames = "orderDto,userId")
    public void logEvent(OrderDto orderDto, Long userId) {
        LOGGER.info("Id of user : " + userId);
        LOGGER.info("Total number of items: " + orderDto.getItems().size());
    }

    @AfterThrowing(pointcut = "execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))", throwing = "e")
    public void afterException(OrderProcessingException e) {
        LOGGER.info(e.getMessage());
    }
}
