package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String name;
    private int dashboardValue;

    public Mentor(String name) {
        this.name = name;
    }

    public int getDashboardValue() {
        return dashboardValue;
    }

    @Override
    public void dashboard(Student student) {
        System.out.println("\n--------------------------------------------------------");
        System.out.println("Current mentor: " + name);
        System.out.println("Student: " + student.getName() + "\nCurrent amount of tasks to complete: " + student.getTasks().size());
        System.out.println("--------------------------------------------------------");
        dashboardValue++;
    }
}
