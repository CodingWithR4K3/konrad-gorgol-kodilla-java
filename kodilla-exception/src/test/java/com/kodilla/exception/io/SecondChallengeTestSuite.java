package com.kodilla.exception.io;

import com.kodilla.exception.test.ExceptionHandling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondChallengeTestSuite {

    @Test
    void probablyIWillThrowExceptionTest() {
        //Given
        ExceptionHandling exceptionHandling = new ExceptionHandling(3, 1.5);
        ExceptionHandling exceptionHandling1 = new ExceptionHandling(1.5, 5);

        //When & Then
        assertEquals(exceptionHandling.probablyIWillThrowExceptionHandler(), "Exception");
        assertEquals(exceptionHandling1.probablyIWillThrowExceptionHandler(), "Done!");
    }

    @Test
    void possibleCasesTest() {

        //Given
        ExceptionHandling exceptionHandling = new ExceptionHandling(2, 0);
        ExceptionHandling exceptionHandling1 = new ExceptionHandling(1, 1);
        ExceptionHandling exceptionHandling2 = new ExceptionHandling(1, 1.5);
        ExceptionHandling exceptionHandling3 = new ExceptionHandling(0.5, 0.5);

        //When & Then
        assertEquals(exceptionHandling.probablyIWillThrowExceptionHandler(), "Exception");
        assertEquals(exceptionHandling1.probablyIWillThrowExceptionHandler(), "Done!");
        assertEquals(exceptionHandling2.probablyIWillThrowExceptionHandler(), "Exception");
        assertEquals(exceptionHandling3.probablyIWillThrowExceptionHandler(), "Exception");
    }
}