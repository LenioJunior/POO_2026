package Classes;

public class MainClasses {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();        
        c1.nome = "João";
        c1.saldo = 100;
        c1.sexo = 'M';

        ContaBancaria c2 = new ContaBancaria();
        c2.nome = "Maria";
        c2.saldo = 200;
        c2.sexo = 'F';

        c1.exibirInformacoes();
        c2.exibirInformacoes();

        System.out.println(String.format("Olá %s, seu saldo é: %.2f", c2.nome, c2.saldo));
    }
}
