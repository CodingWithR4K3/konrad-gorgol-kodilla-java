package com.kodilla;

import java.util.*;
import java.lang.*;


class Zegary {
    public static void main(String[] args) {

        class Clock {

            private final String name;
            private int hours;
            private int minutes;

            public Clock(String name, int hours, int minutes) {

                this.name = name;
                this.hours = hours;
                this.minutes = minutes;
            }

            public String timeTick() {
                minutes = minutes + 1;
                if (minutes == 60) {
                    hours++;
                    minutes = 0;
                }
                return (name + ": " + hours + ":" + minutes);
            }
        }

        final Clock nyclock = new Clock("New York", 14, 59);
        final Clock jpclock = new Clock("Japan", 11, 45);
        final Clock plclock = new Clock("Poland", 19, 35);
        final Clock gbclock = new Clock("Great Britan", 20, 19);
        final Clock nzclock = new Clock("New Zeland", 15, 47);

        final List<Clock> timeList = new LinkedList<>();

        timeList.add(nyclock);
        timeList.add(jpclock);
        timeList.add(plclock);
        timeList.add(gbclock);
        timeList.add(nzclock);

        for (Clock time : timeList) {
            System.out.println(time.timeTick());
        }
    }
}
