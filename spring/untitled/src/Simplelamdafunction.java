public class Simplelamdafunction {
    public static void main(String[] args) {
        Runnable hello = () -> System.out.println("Welcome!");
        hello.run();
    }
}
