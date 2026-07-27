package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Demo_Failtestcases {
    @Test
    void testWrongExceptionMessage() {
        Demo02_BankAccount account = new Demo02_BankAccount("123", 100.0);

        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> account.withdraw(200.0)
        );
        assertEquals("Not enough money", ex.getMessage());
    }
}

