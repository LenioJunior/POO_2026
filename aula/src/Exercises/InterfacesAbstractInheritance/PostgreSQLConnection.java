package Exercises.InterfacesAbstractInheritance;

public class PostgreSQLConnection extends AbstractDatabaseConnection {

    @Override
    protected String getDatabaseEngineName() {
        return "Postgres";
    }
    
}
