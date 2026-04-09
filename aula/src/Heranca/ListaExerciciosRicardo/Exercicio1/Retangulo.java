package Heranca.ListaExerciciosRicardo.Exercicio1;

public class Retangulo extends Figura{

    private double base;

    private double altura;

    private double area;

    public Retangulo(String cor, double x, double y, double base, double altura) {
        super(cor, x, y);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void desenhar(){
        String msg = String.format("Tipo: %s. Cor: %s. Área Calculada: %.2f.", "Retângulo", getCor(), calcularArea());
        System.out.println(msg);
    }

    @Override
    public double calcularArea(){
        area = getBase() * getAltura();
        return area;
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
