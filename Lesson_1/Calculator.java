public class Calculator {
    public static void main(String[] args) {
        int a = 0;
        int b = -3;
        float result = 0;
        char oper = '^'; // +, -, *, /, ^, %
        boolean isResultExist = true;

        if (oper == '+') {
            result = a + b;

        } else if (oper == '-') {
            result = a - b;

        } else if (oper == '*') {
            result = a * b;

        } else if (oper == '/' || oper == '%') {
            if (b == 0) {
                System.out.println("На ноль делить нельзя!");
                isResultExist = false;
            } else if (oper == '/') {
                result = (float)a / b;
            } else {
                result = a % b;
            }

        } else if (oper == '^') {
            if (a == 0 && b == 0) {
                System.out.println("Нулевая степерь нуля не определена.");
                isResultExist = false;
            } else if (b == 0) {
                result = 1;
            } else if (a == 0) {
                if (b < 0) {
                    System.out.println("Нельзя возвести ноль в отрицательную степень.");
                    isResultExist = false;
                } else {
                    result = 0;
                }
            } else {
                result = a;
                for (int i = 2; i <= ((b < 0) ? -b : b); i++) {
                    result = result * a;
                }
                if (b < 0) {
                    result = 1F / result;
                }
            }
        }

        if (isResultExist) {
            System.out.println(String.format("%d%s%d=%.2f", a, oper, b, result));
        }
    }
}