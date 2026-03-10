package GettersSetters;

import java.util.Scanner;

public class MainGetSet {

    private Scanner scanner = new Scanner(System.in);

    public static void readCarData() {
        Carro carro = new Carro();

        System.out.println("Informe o ano do carro");
        int anoLido = 100; // scanner.nextInt();
        carro.setAno(anoLido);

        System.out.println("Ano lido: " + carro.getAno());
        scanner.close();
    }

    public static void main(String[] args) {

        System.out.println("Informe o ano do carro");
        // int anoLido = 100; //scanner.nextInt();
        OperacoesMatematicas om = new OperacoesMatematicas(1000, 2000);
        System.out.println("A soma é: " + om.soma());

        om.setNumero1(100);
        om.setNumero2(200);
        System.out.println("Valor número 1: " + om.getNumero1());
        System.out.println("Valor número 2: " + om.getNumero2());

        System.out.println("A soma é: " + om.soma());

        OperacoesMatematicas novaOm = new OperacoesMatematicas();
        novaOm.setNumero1(5);
        novaOm.setNumero2(4);
        System.out.println("A soma é: " + novaOm.soma());
    }
}
