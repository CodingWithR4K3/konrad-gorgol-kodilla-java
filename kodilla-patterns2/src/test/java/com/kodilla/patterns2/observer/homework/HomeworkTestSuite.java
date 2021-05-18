package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void testDashboard() {
        //Given
        Mentor bolvarFordragon = new Mentor("Bolvar Fordragon");
        Mentor jailer = new Mentor("Jailer");


        Student sylvanasWindrunner = new Student("Sylvanas Windrunner");
        Student anduinWrynn = new Student("Anduin Wrynn");
        Student taeliaFordragon = new Student("Taelia Fordragon");

        taeliaFordragon.registerObserver(bolvarFordragon);
        sylvanasWindrunner.registerObserver(jailer);
        anduinWrynn.registerObserver(jailer);

        //When
        taeliaFordragon.addTask("Polish hammer");
        taeliaFordragon.addTask("Chill");
        sylvanasWindrunner.addTask("Be good raid boss");
        sylvanasWindrunner.addTask("Wipe one player guild 25 times");
        anduinWrynn.addTask("Stay strong");

        //Then
        assertEquals(3, jailer.getDashboardValue());
        assertEquals(2, bolvarFordragon.getDashboardValue());

    }
}
