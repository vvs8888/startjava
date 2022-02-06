package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            Player[] players = new Player[3];
            for (int i = 0; i < players.length; i++) {
                System.out.print("Введите имя " + (i+1) + "-го игрока: ");
                players[i] = new Player(scanner.nextLine());
            }

            String yesNo;
            do {
                GuessNumber gameOne = new GuessNumber(players);
                System.out.println("Игра состоит из трёх раундов");
                for (int i = 1; i <= 3; i++) {
                    gameOne.startGame(i);
                }

                System.out.println("Счет по итогам трёх раундов:");
                for (Player player : players) {
                    System.out.println("Игрок " + player.getName() + " победил " + player.getCntWins() + " раз." );
                }

                do {
                    System.out.print("Хотите продолжить игру? [yes/no]: ");
                    yesNo = scanner.nextLine();
                } while (!"yes".equals(yesNo) && !"no".equals(yesNo));
            } while ("yes".equals(yesNo));
        }
    }
}
