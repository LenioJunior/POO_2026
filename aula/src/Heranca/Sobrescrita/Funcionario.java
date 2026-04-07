package Heranca.Sobrescrita;

public class Funcionario {

    private int idade;
    private float salarioBase;
    private float bonus;
    
    public Funcionario(int idade, float salarioBase, float bonus) {
        this.idade = idade;
        this.salarioBase = salarioBase;
        this.bonus = bonus;
    }

    public void exibirDados(){
        System.out.println("Idade: " + getIdade());
        System.out.println("Salario Base: " + getSalarioBase());
        System.out.println("Bonus: " + getBonus());
        System.out.println("Salário Calculado: " + calcularSalario());
    }

    public float calcularSalario(){
        return salarioBase + bonus;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
}
