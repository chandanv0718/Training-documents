package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class Basictestcase {
    @Test
    void testAdd() {
        Basictestcase calculator = new Basictestcase();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }
    private int add(int i, int i1) {
        return (i+i1);
    }
}
