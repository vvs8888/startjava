package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Player playerOne;
    Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void startGame() {
        Random random = new Random();
        int needGuess = random.nextInt(100) + 1;
        boolean isFinish = false;
        int cntAtempt = 1;

        playerOne.clearNumbers();
        playerTwo.clearNumbers();

        System.out.println("Угадайте число от 1 до 100. У каждого игрока 10 попыток");

        while (!isFinish && cntAtempt <= 10) {
            isFinish = playerAtempt(needGuess, playerOne, cntAtempt);
            if (isFinish) {
                System.out.println("Поздравляем! " + playerOne.getName() + " угадал число " + needGuess + " c " + cntAtempt + " попытки и выиграл у игрока " + playerTwo.getName() + "!");
            } else {
            isFinish = playerAtempt(needGuess, playerTwo, cntAtempt);
                if (isFinish) {
                    System.out.println("Поздравляем! " + playerTwo.getName() + " угадал число " + needGuess + " c " + cntAtempt + " попытки  выиграл у игрока " + playerOne.getName() + "!");
                }
            }
            cntAtempt++;
        }
        if (!isFinish) {
            System.out.println("Никто не выиграл. Было загадано число " + needGuess + ".");
        }
        playerOne.printNumbers();
        playerTwo.printNumbers();
    }

    private boolean playerAtempt(int number, Player player, int cntAtempt) {
        System.out.print("Попытка " + cntAtempt + " у " + player.getName() + ", введите число: ");
        Scanner scanner = new Scanner(System.in);
        if (player.setNumber(scanner.nextInt())) {
            if (number == player.getNumber()) {
                return true;
            } else {
                System.out.println("Данное число (" + player.getNumber() + ") " + (player.getNumber() < number ? "меньше" : "больше") + " того, что загадал компьютер");
            }

            if (cntAtempt == 10) {
                System.out.println("У игрока " + player.getName() + " закончились попытки!");
            }
        } else System.out.println("Введено число вне диапазона (0, 100]");
        return false;
    }
}