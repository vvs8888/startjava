package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {

        String yesNo;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите имя первого игрока: ");
            Player playerOne = new Player(scanner.nextLine());
            System.out.print("Введите имя второго игрока: ");
            Player playerTwo = new Player(scanner.nextLine());

            do {
                GuessNumber gameOne = new GuessNumber(playerOne, playerTwo);
                gameOne.startGame();

                do {
                    System.out.print("Хотите продолжить игру? [yes/no]: ");
                    yesNo = scanner.nextLine();
                } while (!"yes".equals(yesNo) && !"no".equals(yesNo));
            } while ("yes".equals(yesNo));
        }
    }
}
