import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Abstract {
    static double result = 0;
    private static List<String> savedata = new ArrayList<>();
public double cOra() throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.println("어떤 작업을 수행하시겠습니까?");
    System.out.println("1. 산술 연산 계산하기");
    System.out.println("2. 원의 넓이 계산하기");
    int what = scanner.nextInt();


    if (what == 1) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();

        result = arithmeticCalculator.calculate();
        System.out.println(result);
    } else if (what == 2) {
        CircleCalculator circleCalculator = new CircleCalculator();
        circleCalculator.calculate();
    }
    String resultString = String.valueOf(result);

    return result;
}

    public static List<String> getSavedata() {
        return savedata;
    }

    public static void setSavedata(List<String> savedata) {
        Abstract.savedata = savedata;

    }

}
