package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final Player[] players;
    private final Scanner scanner;

    public GuessNumber(Player[] players, Scanner scanner) {
        this.players = players;
        this.scanner = scanner;
        for (Player player : this.players) {
            player.clearWins();
        }
    }

    public void startGame(int round) {
        Random random = new Random();
        int needGuess = random.nextInt(100) + 1;
        boolean isFinish = false;
        int cntAttempt = 1;

        for (Player player : players) {
            player.clearNumbers();
        }

        System.out.println("Раунд " + round + ") Угадайте число от 1 до 100. У каждого игрока 10 попыток");
        setOrderOfGame();

        while (!isFinish && cntAttempt <= 10) {
            for (Player player : players) {
                isFinish = playerAttempt(needGuess, player, cntAttempt);
                if (isFinish) {
                    System.out.println("Поздравляем! " + player.getName() + " угадал число " + needGuess + " c " + cntAttempt + "-й попытки!");
                    player.setCntWins();
                    break;
                }
            }
            cntAttempt++;
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
        int[] order = new int[players.length];
        for (int i = 0; i < order.length; i++) {
            order[i] = random.nextInt(12);
        }
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
        System.out.print("По итогам жребия игроки ходят так: ");
        for (int i = 0; i < players.length-1; i++) {
            System.out.print((i + 1) + " - " + players[i].getName() + ", ");
        }
        System.out.println((players.length) + " - " + players[players.length-1].getName() + ".");
    }

    private boolean playerAttempt(int number, Player player, int cntAttempt) {
        System.out.print("Попытка " + cntAttempt + " у " + player.getName() + ", введите число: ");
        if (player.setNumber(scanner.nextInt())) {
            if (number == player.getNumber()) {
                return true;
            } else {
                System.out.println("Данное число (" + player.getNumber() + ") " + (player.getNumber() < number ? "меньше" : "больше") + " того, что загадал компьютер");
            }

            if (cntAttempt == 10) {
                System.out.println("У игрока " + player.getName() + " закончились попытки!");
            }
        } else System.out.println("Введено число вне диапазона (0, 100]");
        return false;
    }
}