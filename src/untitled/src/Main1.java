@FunctionalInterface
interface Demo {
    void show();

    default void a() {
        System.out.println("Method 1");
    }
    default void b() {
        System.out.println("Method 2");
    }
}
public class Main1 {
    public static void main(String[] args) {
        Demo d = () -> System.out.println("Abstract");

        d.show();
        d.a();
        d.b();
    }
}
