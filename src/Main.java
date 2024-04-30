import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.print("첫 번째 숫자 : ");
            int firstNum = scanner.nextInt();
            System.out.print("연산자 기호 : ");
            String operator = scanner.next();
            System.out.print("두 번째 숫자 : ");
            int secondNum = scanner.nextInt();


            double result = calculator.calculate(firstNum,operator,secondNum);
            System.out.println("연산 결과 : " + result);
            System.out.println("결과를 저장하시겠습니까? 저장하려면 'y'");
            String yes = scanner.next();
            if (yes.equals("y"))
            {
                List<String> savedata = calculator.getSavedata();
                savedata.add(Double.toString(result));
                calculator.setSavedata(savedata);
                System.out.println(savedata);
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String re = scanner.next();
            if (re.equals("exit"))
            {
                break;
            }
        }


    }
}