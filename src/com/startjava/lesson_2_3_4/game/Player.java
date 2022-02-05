package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int cntNumbers;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return numbers[cntNumbers - 1];
    }

    public boolean setNumber(int number) {
        if (number > 0 && number <= 100) {
            this.numbers[cntNumbers] = number;
            cntNumbers++;
            return true;
        }
        return false;
    }

    public void printNumbers() {
        int[] numbersToPrint = Arrays.copyOf(numbers, cntNumbers);
        System.out.print(name + ": ");
        for (int number : numbersToPrint) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public void clearNumbers() {
        if (cntNumbers != 0) {
            Arrays.fill(numbers, 0, cntNumbers, 0);
            cntNumbers = 0;
        }
    }
}
