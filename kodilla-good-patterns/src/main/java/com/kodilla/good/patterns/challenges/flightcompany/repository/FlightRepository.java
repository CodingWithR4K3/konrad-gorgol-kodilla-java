package com.kodilla.good.patterns.challenges.flightcompany.repository;

import java.util.ArrayList;
import java.util.List;

public final class FlightRepository {

    private final List<Flight> flights = new ArrayList<>();

    public FlightRepository() {

        flights.add(new Flight("WROCLAW", "WARSAW"));
        flights.add(new Flight("WARSAW", "POZNAN"));
        flights.add(new Flight("SZCZECIN", "WARSAW"));
        flights.add(new Flight("WARSAW", "SZCZECIN"));
        flights.add(new Flight("GDANSK", "WARSAW"));
        flights.add(new Flight("WARSAW", "GDANSK"));
        flights.add(new Flight("GDANSK", "CRACOW"));
        flights.add(new Flight("CRACOW", "GDANSK"));
        flights.add(new Flight("WROCLAW", "GDANSK"));
        flights.add(new Flight("GDANSK", "WROCLAW"));
    }

    public List<Flight> getFlights() {
        return new ArrayList<>(flights);
    }
}