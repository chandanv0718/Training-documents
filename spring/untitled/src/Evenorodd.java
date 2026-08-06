import java.util.ArrayList;
public class Evenorodd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n + " is Even");
            else
                System.out.println(n + " is Odd");
            int age = 0;
            assert age >=18:"cannot vote;";
            System.out.println("U"+age);
        });
    }
}
