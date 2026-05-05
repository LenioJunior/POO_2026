package Exercises.InterfacesAbstractInheritance;

import java.util.ArrayList;
import java.util.List;

public class MainTestes {
    public static void main(String[] args) {
        PostgreSQLConnection postgres = new PostgreSQLConnection();
        postgres.connect();
        postgres.executeQuery("Minha consulta complexa");
        postgres.disconnect();

        MySQLConnection mySQLConnection = new MySQLConnection();
        mySQLConnection.connect();
        mySQLConnection.executeQuery("SELECT * FROM table");
        mySQLConnection.disconnect();

        List<DatabaseConnection> connections = new ArrayList<>();
        connections.add(new MySQLConnection());
        connections.add(new PostgreSQLConnection());
        DatabaseManager manager = new DatabaseManager();
        manager.testConnections(connections);
    }
}
