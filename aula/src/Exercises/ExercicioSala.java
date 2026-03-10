package Exercises;

import java.util.Scanner;

import Classes.Carro;

public class ExercicioSala {

    public static Carro criarCarro(String marca, String modelo, int ano){
        return new Carro(marca, modelo, ano);
    }
    
    public static void main(String[] args) {
        Carro carro1 = criarCarro("Fiat", "Mobi", 2026);
        carro1.exibirInfo();

        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        double percentual;

        do {
            System.out.println("Informe uma opção:");
            System.out.println("1-Acelerar");
            System.out.println("2-Freiar");
            System.out.println("-1 para sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case -1:
                    System.out.println("Finalizando o programa!");
                    break;
                case 1:
                    System.out.println("Informe o percentual a acelerar:");
                    percentual = scanner.nextDouble();
                    carro1.acelerar(percentual);
                    carro1.exibirVelocidade();
                    break;
                case 2:
                    System.out.println("Informe o percentual a freiar:");
                    percentual = scanner.nextDouble();
                    carro1.freiar(percentual);
                    carro1.exibirVelocidade();
                    break;            
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }

        } while (opcao != -1);
        scanner.close();
    }
}
