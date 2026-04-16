package Heranca.Abstratas;

public abstract class DatabaseWithInsert extends Database {



    @Override
    public void insert(String tableName, String[] fieldsNames, Object[] values) {
    String baseQuery = String.format("INSERT INTO %s", tableName);

    String fieldsQuery = "";
    String fieldsValues = "";
    for (int indexNomes = 0, indexValues = 0; indexNomes < fieldsNames.length && indexValues < values.length; indexNomes++, indexValues++) {
        fieldsQuery += fieldsNames[indexNomes];
        fieldsValues += values[indexValues].toString();
        if(indexNomes < fieldsNames.length - 1){
            fieldsQuery += ", ";
        }
        if(indexValues < values.length - 1){
            fieldsValues += ", ";
        }
    }
    baseQuery += "(" + fieldsQuery + ") VALUES (" + fieldsValues + ")" ;
 
    // executar consulta
    }

    @Override
    public void consultar(String query) {
        System.out.println(query);
    }

    @Override
    public void delete(int id) {
        
    }

    @Override
    public void update(int id) {
        
    }
}
