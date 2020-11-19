package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

@DisplayName("Array Test Suite 😉")
public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {

        int[] exampleNumbers = new int[20];
        IntStream.range(0, exampleNumbers.length)
                .forEach(index -> exampleNumbers[index] = index + 10);

        double sumOfNumbers = IntStream.range(0, exampleNumbers.length)
                .map(index -> exampleNumbers[index] = index + 10)
                .sum();

        double testAverage = sumOfNumbers / exampleNumbers.length;

        Assertions.assertEquals(testAverage, ArrayOperations.getAverage(exampleNumbers));
    }

}
