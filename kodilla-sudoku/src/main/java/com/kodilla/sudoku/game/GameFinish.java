package com.kodilla.sudoku.game;

import java.util.Scanner;

public class GameFinish {
    private static final Scanner scanner = new Scanner(System.in);

    public boolean finishGame() {
        System.out.println("If you want to play once more press ENTER.\n"
                + "If you want to quit type: 'Quit' and press ENTER.\n");
        String decision = scanner.nextLine();
        return decision.equals("Quit") || decision.equals("QUIT") || decision.equals("quit") || decision.equals("q") || decision.equals("Q");
    }
}
