package Heranca.Sobrescrita;

public class Repositor extends Funcionario {
    
    private float ir;

    public Repositor(int idadeRepositor, float salarioBase, float bonus, float ir) {        
        super(idadeRepositor, salarioBase, bonus);
        this.ir = ir;
    }

    @Override
    public double soma(){
        return Math.pow(10, 2);
    }

    public float calcularSalario(){
        return (super.calcularSalario() - getIr()) * 1.4f;
    }

    public float getIr() {
        return ir;
    }

    public void setIr(float ir) {
        this.ir = ir;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("IR: " + getIr());
    }
}
