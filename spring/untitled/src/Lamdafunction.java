import java.util.*;
public class Lamdafunction {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Before: Hello!");
            }
        };
        Runnable r2 = () ->
                System.out.println("After: Hello!");
        List<String> names =
                Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name ->
                System.out.println("Name: " + name));

        r1.run();
        r2.run();
    }
}