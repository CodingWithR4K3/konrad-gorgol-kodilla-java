package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    public void testCalculations() {
        //Given
        //When
        double addResult = calculator.add(5.0, 5.0);
        double subResult = calculator.sub(20.0, 3.0);
        double mulResult = calculator.mul(4.0, 8.0);
        double divResult = calculator.div(30.0, 10.0);

        //Then
        Assertions.assertEquals(addResult, 10.0, 0.01);
        Assertions.assertEquals(subResult, 17.0, 0.01);
        Assertions.assertEquals(mulResult, 32.0, 0.01);
        Assertions.assertEquals(divResult, 3.0, 0.01);
    }
}