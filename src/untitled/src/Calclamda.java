interface Calculator {
    int calculate(int a, int b);
}
public class Calclamda {
    public static void main(String[] args) {
        Calculator div = (int a, int b) -> a / b;
        System.out.println("Division = " + div.calculate(20, 5));
    }
}
