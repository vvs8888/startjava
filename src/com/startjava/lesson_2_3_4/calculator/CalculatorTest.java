package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        String yesNo;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                boolean isCorrectInt = false;
                int a;
                char oper;
                int b;
                do {
                    System.out.print("Введите математическое выражение через пробелы: ");
                    String str = scanner.nextLine();
                    String[] words = str.split(" ");
                    for (String word : words) {
                        System.out.println(word);
                    }
                    a = Integer.parseInt(words[0]);
                    oper = words[1].charAt(0);
                    b = Integer.parseInt(words[2]);

                    if (a <= 0 || b <= 0) {
                        System.out.println("Необходимо ввести целые положительные числа!");
                    } else isCorrectInt = true;
                } while (!isCorrectInt);

                Calculator calcOne = new Calculator();
                Result calcResult = calcOne.calc(a, oper, b);
                String errMsg = calcResult.getErrMsg();

                if (errMsg == null) {
                    System.out.println(String.format("%d%s%d=%.2f", a, oper, b, calcResult.getResult()));
                } else System.out.println(String.format("%s", errMsg));

                do {
                    System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                    yesNo = scanner.nextLine();
                } while (!"yes".equals(yesNo) && !"no".equals(yesNo));
            } while ("yes".equals(yesNo));
        }
    }
}
