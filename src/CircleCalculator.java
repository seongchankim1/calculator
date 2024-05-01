import java.util.Scanner;

public class CircleCalculator {

    static final double pi = Math.PI;
    public double calculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("반지름을 입력하세요.");
        double half = scanner.nextDouble();

        double circle = half * half * pi;
        System.out.println("원의 넓이 : " + circle);
        return circle;
    }
}
