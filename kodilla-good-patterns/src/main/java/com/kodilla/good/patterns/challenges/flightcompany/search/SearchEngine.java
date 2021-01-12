package com.kodilla.good.patterns.challenges.flightcompany.search;

import com.kodilla.good.patterns.challenges.flightcompany.repository.Flight;
import com.kodilla.good.patterns.challenges.flightcompany.repository.FlightRepository;

import java.util.Set;
import java.util.stream.Collectors;

public class SearchEngine {

    private final FlightRepository flightsRepository;

    public SearchEngine(FlightRepository flightsRepository) {
        this.flightsRepository = flightsRepository;
    }

    public Set<Flight> searchAllFromDestination(String fromDestination) {

        return flightsRepository.getFlights().stream()
                .filter(f -> f.getFromDestination().equals(fromDestination))
                .collect(Collectors.toSet());
    }

    public Set<Flight> searchAllToDestination(String toDestination) {

        return flightsRepository.getFlights().stream()
                .filter(f -> f.getToDestination().equals(toDestination))
                .collect(Collectors.toSet());
    }

    public Set<Flight> searchFromToViaDestination(String fromDestination, String toDestination, String viaDestination) {

        Set<Flight> searchResult = flightsRepository.getFlights().stream()
                .filter(f -> (f.getFromDestination().equals(fromDestination) && f.getToDestination().equals(viaDestination)) || (f.getFromDestination().equals(viaDestination) && f.getToDestination().equals(toDestination)))
                .collect(Collectors.toSet());

        int PAIR_CHECK = 2;
        if (searchResult.size() != PAIR_CHECK) {
            searchResult.clear();
        }

        return searchResult;
    }
}

