package mentor;

public class Calculater11 {
    public int add(int a, int b) { return a+b; }

    public int subtract(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int divide(int a, int b){
        return a/b;
    }

    public void defaultOperation(int a, int b, String sign) {
        switch (sign) {
            case "+":
                System.out.println("Результат: " + add(a, b));
                new Main();
                break;
            case "-":
                System.out.println("Результат: " + subtract(a, b));
                new Main();
                break;
            case "*":
                System.out.println("Результат: " + multiply(a, b));
                new Main();
                break;
            case "/":
                System.out.println("Результат: " + divide(a, b));
                new Main();
                break;
            default:
                System.out.println("Ошибка: Неверный оператор");
        }
    }








}
