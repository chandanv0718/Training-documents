public class ifcondition {
    class Main {
        public static void main(String[] args) {
            int a = 10;

            if (a > 10) {
                System.out.println("Greater");
            }
            else if (a == 10) {
                System.out.println("Equal");

                if (a % 2 == 0) {
                    System.out.println("Even");
                }
            }
            else {
                System.out.println("Smaller");
            }
        }
    }
}
