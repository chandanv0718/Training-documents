package org.example;

public class Demo06_PerformanceService1 {

    // This operation completes within 100 milliseconds
    public void quickOperation() {
        try {
            Thread.sleep(100); // simulate fast operation
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Quick operation completed");
    }


    // This operation takes 1000 milliseconds
    public void slowOperation() {
        try {
            Thread.sleep(1000); // simulate slow operation
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Slow operation completed");
    }
}