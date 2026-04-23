package Heranca.Abstratas;

public class ProdutoDatabase extends BaseDatabase {

    @Override
    protected Object[] getFieldsValues() {
        return new Object[] { 1, "Coca-Cola", 15.67 };
    }

    @Override
    protected String getTableName() {
        return "Produtos";
    }

    @Override
    protected String[] getFieldsNames() {
        return new String[] { "id", "descricao", "valor" };
    }
    
}
