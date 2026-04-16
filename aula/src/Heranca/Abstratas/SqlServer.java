package Heranca.Abstratas;

public class SqlServer extends DatabaseWithInsert {

    @Override
    public boolean connect() {
        return true;
    }

    @Override
    public boolean disconnect() {
        return true;
    }
    
    @Override
    public String getConnectionInfo() {
        return "";
    }
    
}
