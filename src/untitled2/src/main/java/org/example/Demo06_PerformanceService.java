package org.example;

public class Demo06_PerformanceService {

    public void quickOperation() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Quick operation completed");
    }

    public void slowOperation() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Slow operation completed");
    }
}
