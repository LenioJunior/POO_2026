package Prova;

import java.util.ArrayList;

public class SistemaFolhaPagamento {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    public void addFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void exibirFolhaPagamento() {
        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirInformacoes();
        }
    }

    public void salvarNoBancoDeDados() {
        System.out.println("Salvando folha de pagamento no banco de dados...");
    }
}
