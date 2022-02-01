package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        String yesNo;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.print("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.print("Введите знак математической операции: ");
                char oper = scanner.next().charAt(0);
                System.out.print("Введите второе число: ");
                int b = scanner.nextInt();

                Calculator calcOne = new Calculator();
                Result calcResult = calcOne.calc(a, oper, b);
                String errMsg = calcResult.getErrMsg();

                if (errMsg == null) {
                    System.out.println(String.format("%d%s%d=%.2f", a, oper, b, calcResult.getResult()));
                } else System.out.println(String.format("%s", errMsg));

                scanner.nextLine(); // считываем конец строки после nextInt

                do {
                    System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                    yesNo = scanner.nextLine();
                } while (!yesNo.equals("yes") && !yesNo.equals("no"));
            } while (yesNo.equals("yes"));
        }
    }
}
