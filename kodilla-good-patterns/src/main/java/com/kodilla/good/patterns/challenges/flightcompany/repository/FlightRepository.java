package com.kodilla.good.patterns.challenges.flightcompany.repository;

import java.util.ArrayList;
import java.util.List;

public final class FlightRepository {

    private final List<FlightImp> flights = new ArrayList<>();

    public FlightRepository() {

        flights.add(new FlightImp("WROCLAW", "WARSAW"));
        flights.add(new FlightImp("WARSAW", "POZNAN"));
        flights.add(new FlightImp("SZCZECIN", "WARSAW"));
        flights.add(new FlightImp("WARSAW", "SZCZECIN"));
        flights.add(new FlightImp("GDANSK", "WARSAW"));
        flights.add(new FlightImp("WARSAW", "GDANSK"));
        flights.add(new FlightImp("GDANSK", "CRACOW"));
        flights.add(new FlightImp("CRACOW", "GDANSK"));
        flights.add(new FlightImp("WROCLAW", "GDANSK"));
        flights.add(new FlightImp("GDANSK", "WROCLAW"));
    }

    public List<FlightImp> getFlights() {
        return new ArrayList<>(flights);
    }
}