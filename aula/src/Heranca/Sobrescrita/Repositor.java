package Heranca.Sobrescrita;

public class Repositor extends Funcionario {
    
    public Repositor(int idadeRepositor, float salarioBase, float bonus) {
        super(idadeRepositor, salarioBase, bonus);
    }

    public float calcularSalario(){
        return super.calcularSalario() * 1.4f;
    }
}
