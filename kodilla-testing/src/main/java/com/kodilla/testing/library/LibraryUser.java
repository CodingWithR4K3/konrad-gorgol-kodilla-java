package com.kodilla.testing.library;

import java.util.Objects;

public class LibraryUser {
    private final String firstname;
    private final String lastname;
    private final String peselId;

    public LibraryUser(String firstname, String lastname, String peselId) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.peselId = peselId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPeselId() {
        return peselId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryUser that = (LibraryUser) o;
        return firstname.equals(that.firstname) &&
                lastname.equals(that.lastname) &&
                peselId.equals(that.peselId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, peselId);
    }
}
