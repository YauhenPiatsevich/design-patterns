package com.epam.pattern.singleton;

public class SingletonExample {

    public static void main(String[] args) {
        // DatabaseConnector connector = new DatabaseConnector("MySQL"); // Has private constructor

        DatabaseConnector connector = DatabaseConnector.getConnection("MySQL");
        connector.connect();

        DatabaseConnector.getConnection("PostgreSQL").connect();
    }
}
