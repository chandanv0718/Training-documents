package org.example;

import java.util.HashMap;
import java.util.Map;

public class Demo04_DatabaseService {

    private Map<String, String> database;
    private boolean connected;

    public Demo04_DatabaseService() {
        database = new HashMap<>();
    }

    public void connect() {
        connected = true;
        System.out.println("Database connected");
    }

    public void disconnect() {
        connected = false;
        database.clear();
        System.out.println("Database disconnected");
    }

    public void insert(String key, String value) {
        if (connected) {
            database.put(key, value);
        }
    }

    public String fetch(String key) {
        if (connected) {
            return database.get(key);
        }
        return null;
    }
}