package mentor;
import java.util.Arrays;
import java.util.Scanner;
public class Main {


        int a = 0;
        int b = 0;
        String sign = "";
        String[] subStr;
        String str;

        Calculater11 calc;

        public Main() {
            calc = new Calculater11();
            System.out.print("Введите пример (через пробел): ");
            Scanner scan = new Scanner(System.in);
            str = scan.nextLine();
            processing();
        }

    public static void main(String[] args) {
        new Main();
    }

    public void processing() {
        String separator = " ";
        subStr = str.split(separator);

        if (Integer.parseInt(subStr[0]) <= 10 && Integer.parseInt(subStr[2]) <= 10) {
            sign = subStr[1];
            a = Integer.parseInt(subStr[0]);
            b = Integer.parseInt(subStr[2]);
            checkErrors(a, b);
            calc.defaultOperation(a, b, sign);
        } else {
            System.out.println("Ошибка: ваш пример не корректен");
            System.exit(0);
        }
    }

    public void checkErrors(int a, int b) {
        if (Arrays.asList(subStr).size() > 3) {
            System.out.println("Ошибка: Вы ввели больше 2 значений");
            System.exit(1);
        }



    }
}
