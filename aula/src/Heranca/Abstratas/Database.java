package Heranca.Abstratas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Database {
    
    public abstract boolean connect();

    public abstract boolean disconnect();

    public abstract void insert(String tableName, String[] fieldsNames, Object[] values);
    public abstract void consultar(String query);
    public abstract void delete(int id);
    public abstract void update(int id);


    public Connection getConnection() {
        try {
            String con = getConnectionInfo();
            return DriverManager.getConnection(con);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar", e);
        }
    }

    public abstract String getConnectionInfo();
}
