package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Pepperoni implements PizzaOrder {

    @Override
    public BigDecimal getCost() {
        return new BigDecimal("6");
    }

    @Override
    public String getDescription() {
        return "Pepperoni, Double Cheese";
    }
}
