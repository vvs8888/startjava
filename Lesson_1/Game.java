public class Game {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        float result = 0;
        char oper = '+'; // +, -, *, /, ^, %
        boolean isResultExist = true;

        if (oper == '+') {
            result = a + b;
        } else if (oper == '-') {
            result = a - b;
        } else if (oper == '*') {
            result = a * b;
        } else if (oper == '/' | oper == '%') {
            if (b == 0) {
                System.out.println("На ноль делить нельзя!");
                isResultExist = false;
            } else if (oper == '/') {
                result = (float)a / b;
            } else {
                result = a % b;
            }
        } else if (oper == '^') {
            if (a == 0 & b == 0) {
                System.out.println("Нулевая степерь нуля не определена.");
                isResultExist = false;
            } else if (b == 0) {
                result = 1;
            } else if (b == 1) {
                result = a;
            } else if (b == -1) {
                result = (float)1 / a;
            } else if (b < 0) {
                result = a;
                for (int i= -2; i >= b; i--) {
                    result = result * a;
                }
                result = (float)1 / result;
            } else {
                result = a;
                for (int i= 2; i <= b; i++) {
                    result = result * a;
                }
            }
        }
        if (isResultExist) {
            System.out.println(a + "" + oper + "" + b + "=" + result);
        }
    }
}