import java.util.LinkedList;

class Demolinkedlistcurdoperation {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        System.out.println("Create: " + list);

        System.out.println("Read: " + list.get(1));

        list.set(1, "Orange");
        System.out.println("Update: " + list);

        list.remove("Apple");
        System.out.println("Delete: " + list);
    }
}
