import java.util.function.*;
public class Operationlamda1 {
    @FunctionalInterface
    interface Greeter { String greet(String name); }

    public static void main(String[] args) {
        Greeter g = name -> "Hello, " + name + "!";
        System.out.println(g.greet("Java 8"));

        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("4 is even: " + isEven.test(4));

        Function<String, Integer> length = String::length;
        System.out.println("Length: " + length.apply("Lambda"));

        Supplier<String> supplier = () -> "Supplied Value";
        System.out.println(supplier.get());
    }
}
