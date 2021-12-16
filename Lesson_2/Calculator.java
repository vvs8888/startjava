public class Calculator {
    private float result;
    private boolean isResultExist;
    private String errMsg;

    public float getResult() {
        return result;
    }

    public boolean getIsResultExist() {
        return isResultExist;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void calc (int a, char oper, int b) {
        isResultExist = true;

        switch(oper) {
            case '+' :
                result = a + b;
                break;
            case '-' :
                result = a - b;
                break;
            case '*' :
                result = a * b;
                break;
            case '/' :
            case '%' :
                if (b == 0) {
                    errMsg = "На ноль делить нельзя!";
                    isResultExist = false;
                } else if (oper == '/') {
                    result = (float)a / b;
                } else {
                    result = a % b;
                }
                break;
            case  '^' :
                if (a == 0 && b == 0) {
                    errMsg = "Нулевая степерь нуля не определена.";
                    isResultExist = false;
                } else if (b == 0) {
                    result = 1;
                } else if (a == 0) {
                    if (b < 0) {
                        errMsg = "Нельзя возвести ноль в отрицательную степень.";
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
                break;
            default :
                errMsg = "Нет такого оператора.";
                isResultExist = false;
        }
    }
}
