package com.kodilla.rps.shapes;

import java.util.ArrayList;

public interface Shape {
    ArrayList<String> getWinsWith();

    ArrayList<String> getLosesWith();

    String getName();
}
