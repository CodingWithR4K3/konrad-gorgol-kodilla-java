package com.kodilla.good.patterns.challenges.flightcompany.search;

import com.kodilla.good.patterns.challenges.flightcompany.repository.Flight;

import java.util.Set;

public final class SearchResult {
    private final Set<Flight> resultSet;

    public SearchResult(Set<Flight> resultSet) {
        this.resultSet = resultSet;
    }

    public void showSearchResult() {

        resultSet.stream()
                .map(flight -> flight.getFromDestination() + " -> " + flight.getToDestination())
                .forEach(System.out::println);
    }
}
