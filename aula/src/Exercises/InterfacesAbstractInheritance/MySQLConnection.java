package Exercises.InterfacesAbstractInheritance;

public class MySQLConnection extends AbstractDatabaseConnection {

    @Override
    protected String getDatabaseEngineName() {
        return "MySQL";
    }

}
