package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String yesNo;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                boolean isCorrectInt = false;
                int a = -1;
                char oper = '~';
                int b = -1;
                do {
                    System.out.print("Введите математическое выражение через пробелы: ");
                    String str = scanner.nextLine();
                    str = str.trim();
                    try {
                        if (str.length() < 5) throw new Exception("Введено менее 5 символов!");

                        if (str.length() != str.replace(" ", "").length() + 2)
                            throw new Exception("В выражении должно быть два разделителя пробела!");

                        if (str.length() != str.replaceAll("\\s[+-/%^\\*]\\s", "").length() + 3)
                            throw new Exception("Данный оператор не поддерживается!");

                        String[] words = str.split(" ");
                        for (String word : words) {
                            System.out.println(word);
                        }
                        if (words.length != 3) throw new Exception("Некорректное число аргументов!");

                        a = Integer.parseInt(words[0]);
                        oper = words[1].charAt(0);
                        b = Integer.parseInt(words[2]);

                        if (a <= 0 || b <= 0) throw new Exception("Необходимо ввести целые положительные числа!");
                        isCorrectInt = true;
                    } catch (NumberFormatException ex) {
                        System.out.println("Аргумент не целое число!");
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                } while (!isCorrectInt);

                Calculator calcOne = new Calculator();
                Result calcResult = calcOne.calc(a, oper, b);
                String errMsg = calcResult.getErrMsg();

                if (errMsg == null) {
                    System.out.printf("%d%s%d=%.2f%n", a, oper, b, calcResult.getResult());
                } else System.out.printf("%s%n", errMsg);

                do {
                    System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                    yesNo = scanner.nextLine();
                } while (!"yes".equalsIgnoreCase(yesNo) && !"no".equalsIgnoreCase(yesNo));

            } while ("yes".equals(yesNo));
        }
    }
}
