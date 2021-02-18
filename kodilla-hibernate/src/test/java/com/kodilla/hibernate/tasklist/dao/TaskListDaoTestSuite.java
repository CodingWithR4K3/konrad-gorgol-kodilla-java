package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {
    private static final String DESCRIPTION = "What a cool TaskList!";
    private static final String TODO = "To Do List";
    private static final String INPROGRESS = "In Progress List";
    private static final String DONE = "Done List";

    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByName() {

        //Given
        TaskList toDoTaskList = new TaskList(TODO, DESCRIPTION);
        TaskList inProgressTaskList = new TaskList(INPROGRESS, DESCRIPTION);
        TaskList doneTaskList = new TaskList(DONE, DESCRIPTION);

        taskListDao.save(toDoTaskList);
        taskListDao.save(inProgressTaskList);
        taskListDao.save(doneTaskList);

        //When
        List<TaskList> findByFirstListName = taskListDao.findByListName(TODO);
        List<TaskList> findBySecondListName = taskListDao.findByListName(INPROGRESS);
        List<TaskList> findByThirdListName = taskListDao.findByListName(DONE);

        String resultForTODO = findByFirstListName.get(0).getListName();
        String resultForINPROGRESS = findBySecondListName.get(0).getListName();
        String resultForDONE = findByThirdListName.get(0).getListName();

        //Then
        Assertions.assertEquals(1, findByFirstListName.size());
        Assertions.assertEquals(1, findBySecondListName.size());
        Assertions.assertEquals(1, findByThirdListName.size());
        Assertions.assertEquals(TODO, resultForTODO);
        Assertions.assertEquals(INPROGRESS, resultForINPROGRESS);
        Assertions.assertEquals(DONE, resultForDONE);

        //CleanUp
        taskListDao.deleteAll();
    }

    @Test
    void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(DESCRIPTION, "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        Assertions.assertNotEquals(0, id);

        //CleanUp
        taskListDao.deleteById(id);
    }
}
