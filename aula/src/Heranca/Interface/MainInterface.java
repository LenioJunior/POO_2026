package Heranca.Interface;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class MainInterface {

    public static void addElementCollection(Collection<Object> lista, Object ele){
         lista.add(ele);    
    }

    public static void addElementList(List<Object> lista, Object ele){
        int index = lista.indexOf(ele);
        if (index == -1)
            lista.add(ele);

        // Lança exceção ou faz algum tratamento.        
    }

    public static void main(String[] args) {
        IDatabase db = new MySql();
        QueryExecutor query = new QueryExecutor();

        query.conectar(db);
        query.executeQuery(db, "");

        ArrayList<Object> a = new ArrayList<>();
        a.add(null);
        a.indexOf(null);
        a.get(1);
        a.remove(null);
        a.size();

        TreeSet<Object> set = new TreeSet<>();
        ArrayDeque<Object> b = new ArrayDeque<>();
        b.add(null);
        // b.indexOf(null);
        // b.get(1);
        b.remove(null);
        b.size();

        addElementList(a, null);
        addElementCollection(set, null);
        addElementCollection(b, null);
    }
}
