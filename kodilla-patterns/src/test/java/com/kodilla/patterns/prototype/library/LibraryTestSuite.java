package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //Given
        Library library = new Library("Library of Maldraxxus");
        library.getBooks().add(new Book("Cycle of Hatred", "Keith R.A.DeCandido", LocalDate.of(2006, 2, 1)));
        library.getBooks().add(new Book("Rise of the Horde", "Christie Golden", LocalDate.of(2006, 8, 17)));
        library.getBooks().add(new Book("Tides of Darkness", "Aaron Rosenberg", LocalDate.of(2007, 8, 14)));
        library.getBooks().add(new Book("Beyond the Dark Portal", "Aaron Rosenberg, Christie Golden", LocalDate.of(2008, 9, 11)));
        library.getBooks().add(new Book("Night of the Dragon", "A.Knaak", LocalDate.of(2008, 1, 21)));
        library.getBooks().add(new Book("Arthas: Rise of the Lich King", "Christie Golden", LocalDate.of(2009, 5, 6)));

        Assertions.assertEquals(6, library.getBooks().size());

        //When
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library of Ardenweald");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library of Bastion");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //Then
        assert clonedLibrary != null;
        Assertions.assertEquals(6, clonedLibrary.getBooks().size());
        assert deepClonedLibrary != null;
        Assertions.assertEquals(6, deepClonedLibrary.getBooks().size());
    }
}