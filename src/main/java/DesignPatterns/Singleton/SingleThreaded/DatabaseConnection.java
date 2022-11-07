package main.java.DesignPatterns.Singleton.SingleThreaded;

public class DatabaseConnection {

    private static DatabaseConnection dbc = null;

    private DatabaseConnection() {

    }

    public static DatabaseConnection getInstance() {
        if (DatabaseConnection.dbc == null) {
            DatabaseConnection.dbc = new DatabaseConnection();
        } 
        return DatabaseConnection.dbc;
    }
}

