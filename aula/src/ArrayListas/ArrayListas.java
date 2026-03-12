package ArrayListas;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListas {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //arrayList();
        arrayNosso();
    }

    public static void arrayNosso(){
        Lista arrayList = new Lista(4);
                
        int contador = 1;
        
        int valor = 0;
        do {
            System.out.println(String.format("Informe o valor %d: ", (contador++)));
            valor = sc.nextInt();
            arrayList.add(valor);
        } while (valor != -1);
       
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(String.format("Valor %d Informado: %s", (i + 1), arrayList.get(i)));
        }
        sc.close();
    }

    public static void arrayList() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
                
        int contador = 1;
        
        int valor = 0;
        do {
            System.out.println(String.format("Informe o valor %d: ", (contador++)));
            valor = sc.nextInt();
            arrayList.add(valor);
        } while (valor != -1);
       
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(String.format("Valor %d Informado: %s", (i + 1), arrayList.get(i)));
        }
    }
}
