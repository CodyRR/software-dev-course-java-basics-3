package org.example;

public class LoopExercises {
    public int sum(int n) {
        // Replace the line below with code that returns the sum of the numbers from 1 to n

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public int sumUntilEven(int n) {

        int sum = 1;
        int counter = 2;

        while (sum % 2 != 0 && counter <= n) {

            sum += counter;
            counter++;
        }

        return sum;
    }
}