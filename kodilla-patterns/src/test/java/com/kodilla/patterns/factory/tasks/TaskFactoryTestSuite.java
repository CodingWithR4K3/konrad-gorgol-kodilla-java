package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testShoppingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);
        assert shoppingTask != null;
        shoppingTask.executeTask();

        //Then
        Assertions.assertEquals("Buying", shoppingTask.getTaskName());
        Assertions.assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING);
        assert paintingTask != null;
        paintingTask.executeTask();

        //Then
        Assertions.assertEquals("Painting", paintingTask.getTaskName());
        Assertions.assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    public void testDrivingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING);

        //Then
        assert drivingTask != null;
        Assertions.assertEquals("Driving", drivingTask.getTaskName());
        Assertions.assertFalse(drivingTask.isTaskExecuted());
    }
}
