package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String yesNo;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                boolean isCorrectInt = false;
                int a = -1;
                char operationSign = '~';
                int b = -1;
                do {
                    System.out.print("Введите математическое выражение через пробелы: ");
                    String str = scanner.nextLine();
                    str = str.replaceAll("\\s+", " ").trim();
                    try {
                        String[] words = str.split(" ");
                        for (String word : words) {
                            System.out.println(word);
                        }
                        if (words.length != 3) throw new Exception("Некорректное число аргументов выражения!");

                        if (!words[0].matches("[1-9]\\d*")) throw new Exception("Первый аргумент не целое положительное число!");
                        a = Integer.parseInt(words[0]);

                        if (!words[1].matches("[+-/%^*]")) throw new Exception("Оператор " + words[1] + " не поддерживается!");
                        operationSign = words[1].charAt(0);

                        if (!words[2].matches("[1-9]\\d*")) throw new Exception("Второй аргумент не целое положительное число!");
                        b = Integer.parseInt(words[2]);

                        isCorrectInt = true;
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                } while (!isCorrectInt);

                Calculator calcOne = new Calculator();
                Result calcResult = calcOne.calc(a, operationSign, b);
                String errMsg = calcResult.getErrMsg();

                if (errMsg == null) {
                    System.out.printf("%d%s%d=%.2f%n", a, operationSign, b, calcResult.getResult());
                } else System.out.printf("%s%n", errMsg);

                do {
                    System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                    yesNo = scanner.nextLine();
                } while (!"yes".equalsIgnoreCase(yesNo) && !"no".equalsIgnoreCase(yesNo));

            } while ("yes".equals(yesNo));
        }
    }
}
