public class Calculator {
    private float result;
    private String resultStr;

    public String calc (int a, char oper, int b) {
        result = 0.0f;
        resultStr = "";

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
                    resultStr = "Результат не определен: на ноль делить нельзя!";
                } else if (oper == '/') {
                    result = (float)a / b;
                } else {
                    result = a % b;
                }
                break;
            case  '^' :
                if (a == 0 && b == 0) {
                    resultStr = "Результат не определен: нулевая степень нуля не определена.";
                } else if (b == 0) {
                    result = 1;
                } else if (a == 0) {
                    if (b < 0) {
                        resultStr = "Результат не определен: нельзя возвести ноль в отрицательную степень.";
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
                resultStr = "Результат не определен: оператор " + oper + " не поддерживается.";
        }
        if (resultStr == ""){
            resultStr = String.format("%.2f", result);
        }
        return resultStr;
    }
}
