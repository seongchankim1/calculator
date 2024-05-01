import java.util.List;
import java.util.Scanner;

public class CRUD {
    double result = 0;
    Scanner scanner = new Scanner(System.in);
    List<String> savedata = Abstract.getSavedata();
    public void save() {
        System.out.println("결과를 저장하시겠습니까? 저장하려면 'y'");
        String yes = scanner.next();


        if (yes.equals("y")) {
            result = Abstract.result;
            savedata.add(String.valueOf(result));
            System.out.println(savedata);
        }
    }
    public void remove() {
        System.out.println("가장 오래된 결과를 삭제하시겠습니까? 삭제하려면 'y'");

        String yes2 = scanner.next();
        if (yes2.equals("y")) {
            savedata.remove(0);
            Abstract.setSavedata(savedata);
            System.out.println(Abstract.getSavedata());
        }
    }
}
