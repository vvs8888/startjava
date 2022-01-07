import java.util.Random;
import java.util.Scanner;

public class Game {
    Player playerOne;
    Player playerTwo;

    public Game(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    private void playerAtempt(int number, Player player) {
        System.out.print(player.getName() + ", введите число: ");
        Scanner scanner = new Scanner(System.in);
        player.setNumber(scanner.nextInt());
        
         if (number != playerOne.getNumber()) {
            if (player.getNumber() < number) {
                System.out.println("Данное число (" + player.getNumber() + ") меньше того, что загадал компьютер");
            } else {
                System.out.println("Данное число (" + player.getNumber() + ") больше того, что загадал компьютер");
            }
        }
    }

    public void startGame() {
        Random random = new Random();
        int needGuess = random.nextInt(100);
        boolean isFinish = false;

        while (!isFinish) {
            playerAtempt(needGuess, playerOne);
            if (needGuess == playerOne.getNumber()){
                isFinish = true;
                System.out.println("Поздравляем! " + playerOne.getName() +" угадал число " + needGuess + " и выиграл у игрока " + playerTwo.getName() + "!");
            } else {
                playerAtempt(needGuess, playerTwo);
                if (needGuess == playerTwo.getNumber()){
                    isFinish = true;
                    System.out.println("Поздравляем! " + playerTwo.getName() + " угадал число " + needGuess + " и выиграл у игрока " + playerOne.getName() + "!");
                }
            }
        }
    }
}