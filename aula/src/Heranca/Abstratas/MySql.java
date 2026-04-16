package Heranca.Abstratas;

public class MySql extends Database {

    @Override
    public boolean connect() {
        
        return true;
    }

    @Override
    public boolean disconnect() {
        // Fechar conexão
        return true;
    }

    @Override
    public String getConnectionInfo() {
        String con = "jdbc:mysql://localhost:3306/meubanco";
        ;
        return con;
    }

    @Override
    public void insert(String tableName, String[] fieldsNames, Object[] values) {
        
    }

    @Override
    public void consultar(String query) {
        
    }

    @Override
    public void delete(int id) {
        
    }

    @Override
    public void update(int id) {
        
    }
}
