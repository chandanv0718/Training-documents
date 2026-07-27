interface Operation {
    int calculate(int a, int b);
}
public class Operationlamda {
    public static void main(String[] args) {
        Operation add = (int x,int y) -> x + y;
        Operation multiply = (int x,int y) -> x * y;
        System.out.println("Addition = " + add.calculate(10, 10));
        System.out.println("Multiplication = " + multiply.calculate(10, 1000));
    }
}
