package Heranca.Abstratas;

public class MainDatabase {
    public static void main(String[] args) {
        ProdutoDatabase produtoDatabase = new ProdutoDatabase();
        ClienteDatabase clienteDatabase = new ClienteDatabase();

        System.out.printf("\n\n\nInsert SQL: %s\n\n\n", produtoDatabase.getInsertSql());
        System.out.printf("\n\n\nInsert SQL: %s\n\n\n", clienteDatabase.getInsertSql());
    }
}
