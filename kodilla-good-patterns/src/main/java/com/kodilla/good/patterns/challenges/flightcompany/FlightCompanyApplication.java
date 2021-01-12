package com.kodilla.good.patterns.challenges.flightcompany;

import com.kodilla.good.patterns.challenges.flightcompany.repository.FlightRepository;
import com.kodilla.good.patterns.challenges.flightcompany.search.SearchEngine;
import com.kodilla.good.patterns.challenges.flightcompany.search.SearchResult;

public class FlightCompanyApplication {
    public static void main(String[] args) {

        FlightRepository flightsRepository = new FlightRepository();
        SearchEngine searchProcessor = new SearchEngine(flightsRepository);

        SearchResult searchResult1 = new SearchResult(searchProcessor.searchAllFromDestination("WROCLAW"));
        SearchResult searchResult2 = new SearchResult(searchProcessor.searchAllToDestination("WROCLAW"));
        SearchResult searchResult3 = new SearchResult(searchProcessor.searchFromToViaDestination("WROCLAW", "WARSAW", "GDANSK"));

        System.out.println();
        searchResult1.showSearchResult();
        System.out.println();
        searchResult2.showSearchResult();
        System.out.println();
        searchResult3.showSearchResult();
    }
}
