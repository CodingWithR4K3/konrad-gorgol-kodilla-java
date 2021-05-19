package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PizzaOrderTestSuite {

    @Test
    public void testPepperoniPizzaOrderGetDescription() {
        //Given
        PizzaOrder pizza = new Pepperoni();
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Pepperoni, Double Cheese", description);
    }

    @Test
    public void testPepperoniPizzaOrderGetCost() {
        //Given
        PizzaOrder pizza = new Pepperoni();
        //When
        BigDecimal totalCost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(6), totalCost);
    }

    @Test
    public void testHawaiiPizzaOrderGetDescription() {
        //Given
        PizzaOrder pizza = new Pepperoni();
        pizza = new Hawaii(pizza);
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Pepperoni, Double Cheese, Pineapple, Double Cheese", description);
    }

    @Test
    public void testHawaiiPizzaOrderGetCost() {
        //Given
        PizzaOrder pizza = new Pepperoni();
        pizza = new Hawaii(pizza);
        //When
        BigDecimal totalCost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(8), totalCost);
    }

    @Test
    public void testCountryPizzaOrderGetDescription() {
        //Given
        PizzaOrder pizza = new Pepperoni();
        pizza = new Country(pizza);
        pizza = new Hawaii(pizza);
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Pepperoni, Double Cheese, Sausage, Pineapple, Double Cheese", description);
    }

    @Test
    public void testCountryPizzaOrderGetCost() {
        //Given
        PizzaOrder pizza = new Pepperoni();
        pizza = new Hawaii(pizza);
        pizza = new Country(pizza);
        //When
        BigDecimal totalCost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(11), totalCost);

    }
}
