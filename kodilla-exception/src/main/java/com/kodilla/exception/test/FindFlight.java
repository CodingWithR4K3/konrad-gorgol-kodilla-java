package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toList;


public class FindFlight {

    private final Map<String, Boolean> flightMap;

    public FindFlight() {
        this.flightMap = new HashMap<>();
        flightMap.put("Warsaw", true);
        flightMap.put("Tokyo", false);
        flightMap.put("Wroclaw", true);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

        if (flight.getDepartureAirport().equals(flight.getArrivalAirport())) {

            System.out.println("You can't fly to the same airport");
            return;
        }

        List<String> tasks = flightMap.entrySet().stream()
                .filter(Map.Entry::getValue)
                .map(Map.Entry::getKey)
                .collect(toList());

        if (tasks.contains(flight.getDepartureAirport()) && tasks.contains(flight.getArrivalAirport())) {

            System.out.println("You are flying from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());

        } else {

            throw new RouteNotFoundException();

        }
    }
}