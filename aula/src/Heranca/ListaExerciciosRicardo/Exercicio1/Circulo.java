package Heranca.ListaExerciciosRicardo.Exercicio1;

public class Circulo extends Figura{

    private double raio;
    
    public Circulo(String cor, double x, double y, double raio) {
        super(cor, x, y);
        this.raio = raio;
    }

    @Override
    public void desenhar(){
        String msg = String.format("Tipo: %s. Cor: %s. Área Calculada: %.2f.", "Círculo", getCor(), calcularArea());
        System.out.println(msg);
    }

    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }
}
