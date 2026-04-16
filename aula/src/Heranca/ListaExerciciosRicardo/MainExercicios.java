package Heranca.ListaExerciciosRicardo;

import java.util.ArrayList;

import Heranca.ListaExerciciosRicardo.Exercicio1.Figura;

public class MainExercicios {
    public static void main(String[] args) {
        Figura figura1 = new Figura("Branca", 10, 20);
        figura1.setId(1);

        Figura figura2 = new Figura("Branca", 10, 20);
         figura2.setId(1);

         Figura figura3 = new Figura("Branca", 10, 20);
        figura3.setId(2);

        System.out.println("Figura 1: " + figura1);
        System.out.println("Figura 2: " + figura2);

        System.out.println("É igual nulo: " + figura1.equals(null));
        System.out.println("É igual string: " + figura1.equals(""));
        System.out.println("É igual inteiro: " + figura1.equals(10));
        System.out.println("É igual figura com outro id: " + figura1.equals(figura3));
        System.out.println("É igual figura com mesmo id: " + figura1.equals(figura2));

         ArrayList<Figura> figuras = new ArrayList<Figura>();
         figuras.add(figura1);
         figuras.add(figura2);
    }
}
