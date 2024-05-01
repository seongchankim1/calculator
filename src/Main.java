import java.util.List;
import java.util.Scanner;

public class Main {
    static final double pi = Math.PI;

    public static void main(String[] args) throws Exception {
        while (true) {


            CRUD crud = new CRUD();
            Scanner scanner = new Scanner(System.in);
            Calculator calculator = new Calculator();
            double result = 0;
            Abstract abs = new Abstract();

            abs.cOra();
            crud.save();
            crud.remove();

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String re = scanner.next();
            if (re.equals("exit")) {
                //break;
                System.out.println("싫습니다.");
            }
        }
    }
}
