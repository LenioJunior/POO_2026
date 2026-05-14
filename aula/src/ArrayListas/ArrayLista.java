package ArrayListas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Heranca.Inicio.Cliente;

public class ArrayLista {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       // arrayList();
       arrayNosso();
    }

    public static void arrayNosso() {
        Lista<Integer> arrayList = new Lista<Integer>(Integer.class, 4);
        arrayList.add(3);

        Lista<String> stringList = new Lista<>(String.class, 4);
        stringList.add("null");

        Lista<Cliente> clienteList = new Lista<>(Cliente.class, 4);
        clienteList.add(null);

        Scanner sc = new Scanner(System.in);
        //sc.close();
        try {
            sc.nextInt();
        } 
        catch (InputMismatchException e) {
        //Valor inválido
            System.out.println("O valor informado é inválido. Forneça um número inteiro válido!");            
        } catch (IllegalStateException e){
        //scanner Inválido
            System.out.println("O scanner está em um estado inválido. Verifique se foi fechado incorretamente!");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        } finally{
            
        }

        int element = -1;
        try {
            element = arrayList.getAt(3);
        } catch (LenioException e){
            System.out.println(e.getMessage());
        } catch (DatabaseNotFoundException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
        
        /// Aqui
        System.out.println(String.format("Elemento %d", element));
                        
        int contador = 1;
        
        int valor = 0;
        do {
            System.out.println(String.format("Informe o valor %d: ", (contador++)));
            valor = sc.nextInt();
            arrayList.add(valor);
        } while (valor != -1);

        try{
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(String.format("Valor %d Informado: %s", (i + 1), arrayList.getAt(i)));
        }
    } catch (Exception e){

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
