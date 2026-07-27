package org.example;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class Demo06_TimeoutTest_PerformanceCheck {
    @Test
    void testQuickExecutionPass() {

        Demo06_PerformanceService service = new Demo06_PerformanceService();

        assertTimeout(Duration.ofMillis(500), () -> {
            service.quickOperation();
        });
    }
    @Test
    void testSlowExecutionFail() {

        Demo06_PerformanceService service = new Demo06_PerformanceService();

        assertTimeout(Duration.ofMillis(500), () -> {
            service.slowOperation();
        });
    }
    @Test
    void testUnrealisticTimeoutFail() {

        Demo06_PerformanceService service = new Demo06_PerformanceService();

        assertTimeout(Duration.ofMillis(50), () -> {
            service.quickOperation();
        });
    }
}