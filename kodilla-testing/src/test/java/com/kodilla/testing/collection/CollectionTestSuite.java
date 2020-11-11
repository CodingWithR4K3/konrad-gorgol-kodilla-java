package com.kodilla.testing.collection;

import org.junit.Assert;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("Test with no list given")
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        ArrayList<Integer> numberList = OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing Exterminator" + numberList);
        //Then
        Assert.assertEquals(emptyList, numberList);
    }

    @DisplayName("Test with a list")

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> normalList = new ArrayList<>(Arrays.asList(15,22,5,3,17,32,7,68));
        ArrayList<Integer> oddList = new ArrayList<>(Arrays.asList(22,32,68));
        //When
        ArrayList<Integer> numberList = OddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing Exterminator" + numberList);
        //Then
        Assert.assertEquals(oddList, numberList);
    }
}
