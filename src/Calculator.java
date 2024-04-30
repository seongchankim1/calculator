import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Calculator {
    private List<String> savedata = new ArrayList<>();

    static class OperatorError extends Exception {
        public OperatorError() {
            super("올바른 연산자를 입력하세요.");
        }
    }

    public void removeResult() {
        savedata.remove(0);
    }


    public double calculate(int number1, String operator, int number2) throws Exception {
        double result = 0;
        switch (operator) {
            case "+":
                result = number1 + number2;
break;
            case "-":
                result = number1 - number2;
break;
            case "*":
                result = number1 * number2;
break;
            case "/":
                if (number2 == 0) {
                    throw new Exception("0으로 나눌 수 없습니다.");
                }
                result = number1 / number2;
break;
            default:
                throw new OperatorError();

        }
return result;
    }
    public List<String> getSavedata() {
        return savedata;
    }

    public void setSavedata(List<String> savedata) {
        this.savedata = savedata;

    }

}
