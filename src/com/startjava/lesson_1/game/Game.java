package com.startjava.lesson_1.game;

public class Game {
    public static void main(String[] args) {
        int needGuess = 13;
        int atempt = 83;
        int bottom = 0;
        int upper = 100;

        while (needGuess != atempt) {
            if (atempt < needGuess) {
                System.out.println("Данное число (" + atempt + ") меньше того, что загадал компьютер");
                bottom = atempt;
                atempt = bottom + (upper - bottom) / 2;
                if (atempt == bottom) {
                    atempt ++;
                }

            } else {
                System.out.println("Данное число (" + atempt + ") больше того, что загадал компьютер");
                upper = atempt;
                atempt = bottom + (upper - bottom) / 2;
            }
        }

        System.out.println("Поздравляю, число " + atempt + " угадано!");
    }
}