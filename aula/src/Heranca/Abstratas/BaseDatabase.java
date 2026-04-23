package Heranca.Abstratas;

public abstract class BaseDatabase {
    
    public String getInsertSql(){
        String tableName = getTableName();
        String fieldsNames = processFieldsNames(getFieldsNames());
        String fieldsValues = processFieldsValues(getFieldsValues());
        return String.format("INSERT INTO %s (%s) VALUES (%s);"
            , tableName, fieldsNames, fieldsValues);
    }

    public String getUpdateSql(){
        String [] fields = getFieldsNames();
        String where = getWhereCondition(fields);
        return String.format("UPDATE %s SET %s WHERE 1 = 1 %s;", 
        getTableName(), "", where);
    }

    protected String getWhereCondition(String[] fields){
        return "";
    }

    private String processFieldsValues(Object [] values){
        String formatted = "";
        for (int i = 0; i < values.length; i++) {
            Object value = values[i];
            if (value.getClass() == String.class){
                formatted += String.format("'%s'", values[i].toString());
            } else {
                formatted += values[i].toString();
            }
            
            if(i < values.length - 1){
                formatted += ", ";
            }
        }
        return formatted;
    }

    protected abstract Object[] getFieldsValues();

    private String processFieldsNames(String [] names){
        String formatted = "";
        for (int i = 0; i < names.length; i++) {
            formatted += String.format("'%s'", names[i]);
            if(i < names.length - 1){
                formatted += ", ";
            }
        }
        return formatted;
    }

    protected abstract String getTableName();

    protected abstract String[] getFieldsNames();
}
