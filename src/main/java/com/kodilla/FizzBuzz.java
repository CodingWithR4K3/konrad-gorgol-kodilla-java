package com.kodilla;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

            ////Każda liczba podzielna przez 15 daje output FizzBuzz
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            }

            ////Każda liczba podzielna przez 3 daje output fizz
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }

            ////Każda liczba podzielna przez 5 daje output buzz
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                /////print aby każda liczba która nie spełnia powyższych warunków wyświeliła się
                System.out.println(i);
            }
        }
    }
}
