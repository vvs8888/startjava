package com.startjava.lesson_2_3_4.calculator;

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
                return new Result((float)a / b);
            case '%' :
                return new Result(a % b);
            case  '^' :
                return new Result((float) Math.pow(a, b));
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
