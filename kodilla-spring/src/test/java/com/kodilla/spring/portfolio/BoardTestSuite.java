package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Optional;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {

        //Given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = applicationContext.getBean(Board.class);

        board.getDoneList().addTask("Bring farmer 10 eggs");
        board.getInProgressList().addTask("Doing task");
        board.getToDoList().addTask("Cook 10 eggs");

        //When
        Optional<String> doneTask = board.getDoneList().getTasks().stream().findAny();
        Optional<String> inProgressTask = board.getInProgressList().getTasks().stream().findAny();
        Optional<String> toDoTask = board.getToDoList().getTasks().stream().findAny();

        //Then
        Assertions.assertTrue(doneTask.isPresent());
        Assertions.assertTrue(inProgressTask.isPresent());
        Assertions.assertTrue(toDoTask.isPresent());
    }
}
