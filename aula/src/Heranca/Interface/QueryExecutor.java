package Heranca.Interface;

public class QueryExecutor {
    public boolean conectar(IDatabase db){
        return db.conectar();
    }

    public Object executeQuery(IDatabase db, String query){
        return db.consultar();
    }
}
