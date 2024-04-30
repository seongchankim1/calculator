
import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        //List 형식으로 만들기
        ArrayList<Integer> list = new ArrayList<>();

        // 스캐너 호출
        Scanner sc = new Scanner(System.in);
        // 다시 계산 'N' 까지 반복
        while (true) {
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            System.out.print("계산 할 첫 번째 숫자 : ");
            int number1 = sc.nextInt();

            // 사칙연산 기호 넣기
            System.out.print("사칙연산 기호 : ");
            char giho = sc.next().charAt(0);

            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            System.out.print("계산 할 두 번째 숫자 : ");
            int number2 = sc.nextInt();

            // 결과 변수 선언
            int result = 0;

            // 기호가 영어로 뭐지?
            switch (giho) {
                case '+':
                    result = number1 + number2;
                    break;
                case '-':
                    result = number1 - number2;
                    break;
                case '*':
                    result = number1 * number2;
                    break;
                case '/':
                    result = number1 / number2;
                    break;
                case '%':
                    result = number1 % number2;
                    break;
                default:
                    System.out.println("잘못된 연산 기호입니다.");


            }

            // 결과 값 띄우고, 리스트에 추가. List이기 때문에 동적할당 됨
            System.out.println("결과 : " + result);
            list.add(result);

            // remove가 입력되면 list에서 0번째 값을 삭제함.
            System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제) : ");
            String remove = sc.next();
            if (remove.equals("remove")) {
                list.remove(0);
            }


            System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) : ");
            // inquiry 입력
            String inquiry = sc.next();
            if (inquiry.equals("inquiry")) {
                // index를 1로 초기화
                int index = 1;
                // foreach 문을 사용하여, list의 모든 요소를 i에 저장.
                for (Integer i : list) {
                    // index(번째) 를 출력하고 다음 번째를 위하여 1을 더한다.
                    System.out.println(index++ + ". " + i);
                }
            }

            while (true) {
                System.out.print("다시 계산하시겠습니까? Y/N : ");
                // 다시 계산할건지 Y N을 받는다.

                String answer = sc.next();
                if (answer.equals("Y")) {
                    break;
                } else if (answer.equals("N")) {
                    return;
                    // 잘못된 값이면 break 대신 continue를 넣으면 다시 돌아가서 선택이 가능하지만
                    // 그냥 넘어가게 했다.
                } else {
                    System.out.println("잘못된 값이지만 그냥 다시 계산하겠습니다.");
                    break;
                }
            }
        }


    }
}