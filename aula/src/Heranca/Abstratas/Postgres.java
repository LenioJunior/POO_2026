package Heranca.Abstratas;

public class Postgres extends DatabaseWithInsert {

    @Override
    public boolean connect() {
        
        return true;
    }

    @Override
    public boolean disconnect() {
        // Fechar conexão
        return false;
    }

    @Override
    public String getConnectionInfo() {
        String con = "jdbc:postgresql://localhost:5432/seu_banco";
        return con;
    }
}

