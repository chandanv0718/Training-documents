public class Isalive {
    public static void main(String[] args) {

        MyThread t = new MyThread();

        System.out.println("Before start: " + t.isAlive());

        t.start();

        System.out.println("After start: " + t.isAlive());
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Thread: " + i);
        }
    }
}