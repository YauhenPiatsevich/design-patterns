package com.epam.pattern.singleton;

public class DatabaseConnector {

    private static volatile DatabaseConnector databaseConnector;

    private String databaseName;

    private DatabaseConnector(String databaseName) {
        this.databaseName = databaseName;
    }

    public static DatabaseConnector getConnection(String databaseName) {
        DatabaseConnector localDatabaseConnector = databaseConnector;
        if (localDatabaseConnector == null) {
            synchronized (DatabaseConnector.class) {
                localDatabaseConnector = databaseConnector;
                if (localDatabaseConnector == null) {
                    databaseConnector = localDatabaseConnector = new DatabaseConnector(databaseName);
                }
            }
        }
        return localDatabaseConnector;
    }

    public void connect() {
        System.out.println("Connector " + databaseName + " connecting to the database...");
    }
}
