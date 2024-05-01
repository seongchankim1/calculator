import java.util.Scanner;

public class ArithmeticCalculator {


    public static double calculate() throws Exception {
        double result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 숫자 : ");
        int number1 = scanner.nextInt();
        System.out.print("연산자 기호 : ");
        String operator = scanner.next();
        System.out.print("두 번째 숫자 : ");
        int number2 = scanner.nextInt();
        switch (operator) {
            case "+":
                AddOperator addOperator = new AddOperator();
                result = addOperator.operate(number1, number2);
                break;
            case "-":
                SubtractOperator subtractOperator = new SubtractOperator();
                result = subtractOperator.operate(number1, number2);
                break;
            case "*":
                MultiplyOperator multiplyOperator = new MultiplyOperator();
                result = multiplyOperator.operate(number1, number2);
                break;
            case "/":
                if (number2 == 0) {
                    throw new Exception("0으로 나눌 수 없습니다.");
                }
                DivideOperator divideOperator = new DivideOperator();
                result = divideOperator.operate(number1, number2);
                break;
            case "%":
                ModOperator modOperator = new ModOperator();
                result = modOperator.operate(number1, number2);
                break;
            default:
                throw new Calculator.OperatorError();

        }
        return result;
    }
}
