package com.kodilla.stream.world;

import org.junit.jupiter.api.*;

import java.math.BigDecimal;


@DisplayName("World Tests 😉")
public class WorldTestSuite {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("This is beginning of tests");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("All tests are done!");
    }

    private static World getTestWorld() {

        final World world = new World();

        testUK(world);
        testEurope(world);
        testUSA(world);

        return world;
    }

    private static void testUK(final World world) {

        final Continent unitedKingdom = new Continent();
        unitedKingdom.addCountry(new Country(new BigDecimal(120)));
        unitedKingdom.addCountry(new Country(new BigDecimal(200)));
        world.addContinent(unitedKingdom);
    }

    private static void testEurope(final World world) {

        final Continent europe = new Continent();
        europe.addCountry(new Country(new BigDecimal(120)));
        europe.addCountry(new Country(new BigDecimal(400)));
        europe.addCountry(new Country(new BigDecimal(120)));
        europe.addCountry(new Country(new BigDecimal(200)));
        europe.addCountry(new Country(new BigDecimal(120)));
        world.addContinent(europe);
    }

    private static void testUSA(final World world) {

        final Continent unitedStates = new Continent();
        unitedStates.addCountry(new Country(new BigDecimal(999)));
        unitedStates.addCountry(new Country(new BigDecimal(300)));
        unitedStates.addCountry(new Country(new BigDecimal(999)));
        unitedStates.addCountry(new Country(new BigDecimal(400)));
        world.addContinent(unitedStates);
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Starting Test....");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Test is done!");
    }

    @Test
    public void testGetPeopleQuantity() {

        //Give
        final World world = getTestWorld();

        //When
        final BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        final BigDecimal expectedPeople = new BigDecimal("3978");
        Assertions.assertEquals(expectedPeople, totalPeople);
    }
}
