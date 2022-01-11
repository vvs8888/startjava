package com.startjava.lesson_2_3.calculator;

public class Calculator {
    public Result calc (int a, char oper, int b) {

        switch(oper) {
            case '+' :
                return new Result(a + b);
            case '-' :
                return new Result(a - b);
            case '*' :
                return new Result(a * b);
            case '/' :
            case '%' :
                if (b == 0) {
                    return new Result("Результат не определен: на ноль делить нельзя!");
                } else if (oper == '/') {
                    return new Result((float)a / b);
                } else {
                    return new Result(a % b);
                }
            case  '^' :
                if (a == 0 && b == 0) {
                    return new Result("Результат не определен: нулевая степень нуля не определена.");
                } else if (b == 0) {
                    return new Result(1);
                } else if (a == 0) {
                    if (b < 0) {
                        return new Result("Результат не определен: нельзя возвести ноль в отрицательную степень.");
                    } else {
                        return new Result(0);
                    }
                } else {
                    float result = a;
                    for (int i = 2; i <= ((b < 0) ? -b : b); i++) {
                        result = result * a;
                    }
                    if (b < 0) {
                        result = 1F / result;
                    }
                    return new Result(result);
                }
            default :
                return new Result("Результат не определен: оператор " + oper + " не поддерживается.");
        }
    }
}

class Result {
    private float result;
    private String errMsg;

    public Result(float result) {
        this.result = result;
    }

    public Result(String errMsg) {
        this.errMsg = errMsg;
    }

    public float getResult() {
        return result;
    }

    public String getErrMsg() {
        return errMsg;
    }
}
