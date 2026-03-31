package Heranca.Inicio;

public class ClienteFisico extends Cliente {
    private String nome;
    private String cpf;

    public boolean verificarCpf(String cpf){
        return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
}
