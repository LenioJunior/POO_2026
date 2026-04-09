package Heranca.ListaExerciciosRicardo.Exercicio1;

public class Triangulo extends Figura {

    private double base;

    private double altura;

    public Triangulo(String cor, double x, double y) {
        super(cor, x, y);
    }
    
    @Override
    public void desenhar(){
        String msg = String.format("Tipo: %s. Cor: %s. Área Calculada: %.2f.", "Triângulo", getCor(), calcularArea());
        System.out.println(msg);
    }

    @Override
    public double calcularArea(){
        return (getBase() * getAltura()) / 2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
}
