package main.java.DesignPatterns.Singleton.EagerLoading;

public class DatabaseConnection {

    private static DatabaseConnection dbc = new DatabaseConnection();

    private DatabaseConnection() {
        
    }

    public static DatabaseConnection getInstance() {
        return DatabaseConnection.dbc
    }
}