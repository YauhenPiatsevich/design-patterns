package com.epam.pattern.singleton;

public class DatabaseConnector
{
    private static DatabaseConnector databaseConnector;

    private String databaseName;

    private DatabaseConnector(final String databaseName)
    {
        this.databaseName = databaseName;
    }

    public static DatabaseConnector getConnection(final String databaseName)
    {
        if (databaseConnector == null)
        {
            databaseConnector = new DatabaseConnector(databaseName);
        }
        return databaseConnector;
    }

    public void connect()
    {
        System.out.println("Connector " + databaseName + " connecting to the database...");
    }
}
