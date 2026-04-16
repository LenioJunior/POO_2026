package Heranca.Abstratas;

public class MainAbstratas {
    public static void main(String[] args) {
        MainAbstratas main = new MainAbstratas();

        Postgres postgres = new Postgres();
        MySql mysql = new MySql();

        String[] fields = new String[]{"id", "name", "valor"};
        Object[] values = new Object[] {1, "João", 1000};
        postgres.insert("Clientes", fields, values);

        main.connect(postgres);
        main.connect(mysql);
    }

    public void connect(Database database) {
        database.getConnection();
    }

    public void disconnect(Database database) {
        database.disconnect();
    }

    public void insert(Database database){
        database.insert("", new String[2], new String[2]);
    }
}
