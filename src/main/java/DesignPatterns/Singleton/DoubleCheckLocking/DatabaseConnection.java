package main.java.DesignPatterns.Singleton.DoubleCheckLocking;

public class DatabaseConnection {

    private static DatabaseConnection dbc = null;

    private DatabaseConnection() {

    }

    public static DatabaseConnection getInstance() {

        if (DatabaseConnection.dbc == null) {
            synchronized(DatabaseConnection.class) {
                if (DatabaseConnection.dbc == null) {
                    DatabaseConnection.dbc = new DatabaseConnection();
                }
            }
        } 
        return DatabaseConnection.dbc;
    }
}