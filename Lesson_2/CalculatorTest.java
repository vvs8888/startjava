import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String yesNo;
        
        Calculator calcOne = new Calculator();
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.print("Введите знак математической операции: ");
            char oper = scanner.next().charAt(0);
            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();

            System.out.println(String.format("%d%s%d=%s", a, oper, b, calcOne.calc(a, oper, b)));

            scanner.nextLine(); // считываем конец строки после nextInt

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                yesNo = scanner.nextLine();
            } while (!yesNo.equals("yes") & !yesNo.equals("no"));
        } while (yesNo.equals("yes"));
    }
}
