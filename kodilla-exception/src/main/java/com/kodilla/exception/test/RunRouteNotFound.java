package com.kodilla.exception.test;

public class RunRouteNotFound {

    public static void main(String[] args) {

        Flight flight = new Flight("Wroclaw", "Warsaw");
        FindFlight flightSearcher = new FindFlight();

        try {
            flightSearcher.findFlight(flight);

        } catch (RouteNotFoundException e) {
            System.out.println("Wrong airport");
            System.out.println("Catch " + e);
        }
    }
}