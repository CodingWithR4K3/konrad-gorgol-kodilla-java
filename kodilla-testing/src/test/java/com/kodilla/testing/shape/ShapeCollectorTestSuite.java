package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;

@DisplayName("ShapeCollector Tests 😉")
public class ShapeCollectorTestSuite {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("This is beginning of tests");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("All tests are done!");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Starting Test....");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Test is done!");
    }

    @Nested
    @DisplayName("Tests for adding and removing figure")
    class AddAndRemove {
    @Test
    public void testAddFigure() {
        //Given

        ShapeCollector testList = new ShapeCollector(new ArrayList<>(Arrays.asList(
                new Triangle(15, 20),
                new Square(14))));
        ShapeCollector expectedList = new ShapeCollector(new ArrayList<>(Arrays.asList(
                new Circle(26),
                new Triangle(15, 20),
                new Square(14))));
        int expectedListSize = expectedList.getShapeList().size();
        //When

        testList.addFigure(new Circle(26));
        int actualListSize = testList.getShapeList().size();

        //Then

        Assertions.assertEquals(expectedListSize, actualListSize);
    }

    @Test
    public void testRemoveFigure() {
        //Given

        Circle circle = new Circle(26);
        Triangle triangle = new Triangle(15, 20);
        Square square = new Square(14);

        ShapeCollector testList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(
                circle, triangle, square)));
        ShapeCollector expectedList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(triangle, square)));

        int expectedListSize = expectedList.getShapeList().size();
        //When
        testList.removeFigure(circle);
        int actualListSize = testList.getShapeList().size();

        //Then
        Assertions.assertEquals(expectedListSize, actualListSize);
    }
    }

    @Nested
    @DisplayName("Tests for Getting figures and showing them")
    class GetAndShow {

        @Test
        public void testGetFigure() {
            //Given
            Circle circle = new Circle(26);
            Triangle triangle = new Triangle(15, 20);
            Square square = new Square(14);

            ShapeCollector testList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(
                    circle, triangle, square)));

            //When
            Shape shape1 = testList.getFigure(1);
            Shape shape2 = testList.getFigure(2);
            Shape shape3 = testList.getFigure(3);


            //Then
            Assertions.assertEquals(triangle, shape1);
            Assertions.assertEquals(square, shape2);
            Assertions.assertEquals(null, shape3);
        }

        @Test
        public void testShowFigures() {
            //Given
            Circle circle = new Circle(26);
            Triangle triangle = new Triangle(15, 20);
            Square square = new Square(14);
            ArrayList<Shape> testList = new ArrayList<Shape>(Arrays.asList(
                    circle, triangle, square));
            ShapeCollector shapesCollection = new ShapeCollector(testList);

            //Then
            Assertions.assertEquals(testList, shapesCollection.showFigures());
        }
    }
}



