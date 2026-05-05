package Exercises.InterfacesAbstractInheritance;

public interface DatabaseConnection {
    
    public boolean connect();
    public boolean disconnect();
    public void executeQuery(String query);
}
