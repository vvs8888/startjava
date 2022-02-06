package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Player[] players;

    public GuessNumber(Player[] players) {
        this.players = players;
        for (Player player : this.players) {
            player.clearWins();
        }
    }

    public void startGame(int round) {
        Random random = new Random();
        int needGuess = random.nextInt(100) + 1;
        boolean isFinish = false;
        int cntAtempt = 1;

        for (Player player : players) {
            player.clearNumbers();
        }

        System.out.println("Раунд " + round + ") Угадайте число от 1 до 100. У каждого игрока 10 попыток");
        setOrderOfGame();

        while (!isFinish && cntAtempt <= 10) {
            for (Player player : players) {
                isFinish = playerAtempt(needGuess, player, cntAtempt);
                if (isFinish) {
                    System.out.println("Поздравляем! " + player.getName() + " угадал число " + needGuess + " c " + cntAtempt + "-й попытки!");
                    player.setCntWins();
                    break;
                }
            }
            cntAtempt++;
        }
        if (!isFinish) {
            System.out.println("Никто не выиграл. Было загадано число " + needGuess + ".");
        }
        for (Player player : players) {
            player.printNumbers();
        }
    }

    private void setOrderOfGame() {
        System.out.println("Бросим жребий, чтобы определить порядок угадывания числа");
        Random random = new Random();
        int[] order = {random.nextInt(12), random.nextInt(12), random.nextInt(12)};
        int temp;
        Player tempPlayer;
        for (int i = order.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (order[j] > order[j + 1]) {
                    temp = order[j];
                    tempPlayer = players[j];
                    order[j] = order[j + 1];
                    players[j] = players[j + 1];
                    order[j + 1] = temp;
                    players[j + 1] = tempPlayer;
                }
            }
        }
        System.out.println("По итогам жребия игроки ходят так: 1 - " + players[0].getName() + ", 2 - " + players[1].getName() + ", 3 - " + players[2].getName());
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