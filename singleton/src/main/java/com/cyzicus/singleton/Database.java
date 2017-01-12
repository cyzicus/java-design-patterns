package com.cyzicus.singleton;

public class Database {

    private static Database instance = new Database();
    private static Database oldWayInstance;

    private Database(){}

    public static Database getInstance() {
        return instance;
    }

    public static Database getOldWayInstance() {
        if(oldWayInstance == null) {
            return new Database();
        }
        return oldWayInstance;
    }

    public String connect() {
        return "Connecting to database\n";
    }

    public String disconnect() {
        return "Disconnecting from database\n";
    }
}
