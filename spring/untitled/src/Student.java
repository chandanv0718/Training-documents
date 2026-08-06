import java.util.Scanner;

class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = "";
        int pwd = 0;

        while (!id.equals("Chandan") || pwd != 1234) {
            System.out.print("Enter Login ID: ");
            id = sc.next();

            System.out.print("Enter Password: ");
            pwd = sc.nextInt();
        }

        System.out.println("Welcome Chandan");
    }
}