package Heranca.Abstratas;

public class ClienteDatabase extends BaseDatabase {

    @Override
    protected Object[] getFieldsValues() {
        return new Object[] { 4, "João Silva", 45, 1.79 };
    }

    @Override
    protected String getTableName() {
        return "Clientes";
    }

    @Override
    protected String[] getFieldsNames() {
        return new String[] { "id", "name", "idade", "altura" };
    }
    
}
