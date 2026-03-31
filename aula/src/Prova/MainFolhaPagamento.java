package Prova;


public class MainFolhaPagamento {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Func 1", 100, 10, 5);
        Funcionario f2 = new Funcionario("Func 2", 200, 20, 10);

        SistemaFolhaPagamento folhaPagamento = new SistemaFolhaPagamento();
        folhaPagamento.addFuncionario(f1);
        folhaPagamento.addFuncionario(f2);
        folhaPagamento.exibirFolhaPagamento();
    }
}