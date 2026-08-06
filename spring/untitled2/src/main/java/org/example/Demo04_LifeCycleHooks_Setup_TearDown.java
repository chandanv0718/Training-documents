package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Demo04_LifeCycleHooks_Setup_TearDown {

    private Demo04_DatabaseService db;

    @BeforeEach
    void init() {
        db = new Demo04_DatabaseService();
        db.connect();
        System.out.println("Setup completed");
    }

    @AfterEach
    void cleanup() {
        db.disconnect();
        System.out.println("Teardown completed");
    }

    @Test
    void testInsertAndFetchPass() {
        db.insert("user1", "Prasunamba");

        assertEquals(
                "Prasunamba",
                db.fetch("user1")
        );
    }

    @Test
    void testInsertAndFetchFailValue() {
        db.insert("user1", "Prasunamba");

        assertEquals(
                "WrongName",
                db.fetch("user1"),
                "Expected WrongName but got " + db.fetch("user1")
        );
    }

    @Test
    void testFetchNonExistentKeyFail() {

        assertEquals(
                "SomeValue",
                db.fetch("missingKey"),
                "Expected SomeValue but got " + db.fetch("missingKey")
        );
    }
}