import java.util.function.*;

public class Inttodouble {

    public static void main(String[] args) {

        IntToDoubleFunction intToDouble = n -> n * 2.5;

        System.out.println(intToDouble.applyAsDouble(4));
        System.out.println(intToDouble.applyAsDouble(10));
    }
}
