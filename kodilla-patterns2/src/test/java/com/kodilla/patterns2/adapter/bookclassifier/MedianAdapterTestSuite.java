package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();

        bookSet.add(new Book("Cycle of Hatred", "Keith R.A.DeCandido", 2006, "1S"));
        bookSet.add(new Book("Rise of the Horde", "Christie Golden", 2006, "2S"));
        bookSet.add(new Book("Tides of Darkness", "Aaron Rosenberg", 2007, "3S"));
        bookSet.add(new Book("Beyond the Dark Portal", "Aaron Rosenberg, Christie Golden", 2008, "4S"));
        bookSet.add(new Book("Night of the Dragon", "A.Knaak", 2008, "5S"));
        bookSet.add(new Book("Arthas: Rise of the Lich King", "Christie Golden", 2009, "5S"));
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(2008, median);
    }
}
