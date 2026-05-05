package Exercises.InterfacesAbstractInheritance;

public abstract class AbstractDatabaseConnection implements DatabaseConnection {

    protected String host;
    protected int port;
    protected String database;

    @Override
    public boolean connect() {
        try {
            // Tenta conectar no banco...
            System.out.println(String.format("Conectando ao banco %s...", getDatabaseEngineName()));
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    @Override
    public boolean disconnect() {
        System.out.println(String.format("Desconectando do %s...", getDatabaseEngineName()));
        return false;
    }

    @Override
    public void executeQuery(String query) {
        String msg = String.format("Executando query no %s: %s", getDatabaseEngineName(), query);
        System.out.println(msg);
    }

    protected abstract String getDatabaseEngineName();
}
