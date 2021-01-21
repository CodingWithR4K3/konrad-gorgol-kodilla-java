package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        //Given
        User mark = new Millenials("Mark", "Marcus");
        User john = new YGeneration("John", "Johnson");
        User lucas = new ZGeneration("Lucas", "Lucius");

        //When
        String markPublisher = mark.sharePost();
        String johnPublisher = john.sharePost();
        String lucasPublisher = lucas.sharePost();

        //Then
        Assertions.assertEquals("Facebook", markPublisher);
        Assertions.assertEquals("Twitter", johnPublisher);
        Assertions.assertEquals("Snapchat", lucasPublisher);
    }
}
