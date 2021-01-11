package com.kodilla.good.patterns.challenges.flightcompany.repository;

import java.util.Objects;

public final class Flight implements FlightImp {
    private final String fromDestination;
    private final String toDestination;

    public Flight(String fromDestination, String toDestination) {
        this.fromDestination = fromDestination;
        this.toDestination = toDestination;
    }

    public String getFromDestination() {
        return fromDestination;
    }

    public String getToDestination() {
        return toDestination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (!Objects.equals(fromDestination, flight.fromDestination))
            return false;
        return Objects.equals(toDestination, flight.toDestination);
    }

    @Override
    public int hashCode() {
        int result = fromDestination != null ? fromDestination.hashCode() : 0;
        result = 31 * result + (toDestination != null ? toDestination.hashCode() : 0);
        return result;
    }
}
