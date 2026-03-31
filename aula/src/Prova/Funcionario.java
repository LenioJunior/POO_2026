package Prova;

public class Funcionario {

    private String nomeFuncionario;
    private double salarioBase;
    private double bonus;
    private double desconto;   

    public Funcionario(String nomeFuncionario, double salarioBase, double bonus, double desconto) {
        this.nomeFuncionario = nomeFuncionario;
        this.salarioBase = salarioBase;
        this.bonus = bonus;
        this.desconto = desconto;
    }

    public double calcularSalarioLiquido() {
        return getSalarioBase() + getBonus() - getDesconto();     
    }

    public void exibirInformacoes(){
        System.out.println("Funcionário: " + getNomeFuncionario());
        System.out.println("Salário base: " + getSalarioBase());
        System.out.println("Bônus: " + getBonus());
        System.out.println("Desconto: " + getDesconto());
        System.out.println("Salário líquido: " + calcularSalarioLiquido());        
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
