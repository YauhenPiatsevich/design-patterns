package com.epam.pattern.singleton;

public class SingletonExample
{
    public static void main(String[] args)
    {
//        final DatabaseConnector connector = new DatabaseConnector("MySQL"); // Has private constructor

        final DatabaseConnector connector = DatabaseConnector.getConnection("MySQL");
        connector.connect();

        DatabaseConnector.getConnection("PostgreSQL").connect();
    }
}
