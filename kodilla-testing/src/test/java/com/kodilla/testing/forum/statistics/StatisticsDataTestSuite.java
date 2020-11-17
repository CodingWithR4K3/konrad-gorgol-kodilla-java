package com.kodilla.testing.forum.statistics;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@DisplayName("StatisticsData Tests 😉")
public class StatisticsDataTestSuite {

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Test
    public void testCalculateAdvStatistics0Posts() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        StatisticsData statisticsData = new StatisticsData();

        //When
        statisticsData.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticsData.getPostsCount());
        statisticsData.showStatistics();
    }

    @Test
    public void testCalculateAdvStatistics1000Posts() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        StatisticsData statisticsData = new StatisticsData();

        //When
        statisticsData.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(1000, statisticsData.getPostsCount());
        statisticsData.showStatistics();
    }

    @Test
    public void testCalculateAdvStatisticsZeroComments() {
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0);
        StatisticsData statisticsData = new StatisticsData();

        //When
        statisticsData.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticsData.getCommentsCount());
        statisticsData.showStatistics();

    }

    @Test
    public void testCalculateAdvStatisticsLessComments() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(400);
        when(statisticsMock.commentsCount()).thenReturn(200);
        StatisticsData statisticsData = new StatisticsData();

        //When
        statisticsData.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertTrue(statisticsData.getCommentsCount() < statisticsData.getPostsCount());
        statisticsData.showStatistics();
    }

    @Test
    public void testCalculateAdvStatisticsMoreComments() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(200);
        when(statisticsMock.commentsCount()).thenReturn(400);
        StatisticsData statisticsData = new StatisticsData();

        //When
        statisticsData.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertTrue(statisticsData.getCommentsCount() > statisticsData.getPostsCount());
        statisticsData.showStatistics();
    }

    @Test
    public void testCalculateAdvStatistics0Users() {

        //Given
        ArrayList<String> usersList = new ArrayList<>();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        StatisticsData statisticsData = new StatisticsData();

        //When
        statisticsData.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticsData.getUsersCount());
        statisticsData.showStatistics();
    }

    @Test
    public void testCalculateAdvStatistics100Users() {

        //Given
        List<String> usersList = Arrays.asList(new String[100]);
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        StatisticsData statisticsData = new StatisticsData();

        //When
        statisticsData.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, statisticsData.getUsersCount());
        statisticsData.showStatistics();
    }

    @Test
    public void testCalculateAdvStatisticsAverage() {

        //Given
        List<String> usersList = Arrays.asList(new String[50]);
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(51);
        when(statisticsMock.postsCount()).thenReturn(75);
        StatisticsData statisticsData = new StatisticsData();

        //When
        statisticsData.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0.68, statisticsData.getAverageCommentsPerPost(), 0.01);
        Assert.assertEquals(1.02, statisticsData.getAverageCommentsPerUser(), 0.01);
        Assert.assertEquals(1.5, statisticsData.getAveragePostsPerUser(), 0.01);
        statisticsData.showStatistics();
    }
}