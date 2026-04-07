package Heranca.Sobrescrita;

public class MainSobrescrita {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(30, 90, 10);
        Repositor repositor = new Repositor(15, 90, 10);

        funcionario.exibirDados();
        repositor.exibirDados();
    }
}
