package Classes;

public class ContaBancaria {
    String nome;
    double saldo;
    char sexo;

    public void exibirInformacoes(){
        String message = "";
        if (sexo == 'M') {
            message = "Olá Sr %s. ";
        } else {
            message = "Olá Sra %s. ";            
        }
        message += "O valor disponível em conta é: %.2f. Sexo: %c";
        System.out.println(String.format(message, nome, saldo, sexo));
    }
}
