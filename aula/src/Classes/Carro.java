package Classes;

public class Carro {

    private String marca;

    private String modelo;

    private int ano;

    private double velocidade;

    public double getVelocidade() {
        return velocidade;
    }

    private double tratarPercentual(double percentual, double padrao) {
        if (percentual < 0 || percentual > 100)
            return 0;

        if (percentual > 1) {
            percentual /= 100;
        }

        if (velocidade == 0) {
            velocidade = padrao;
        }
        return percentual;

    }

    public void acelerar(double percentual) {

        percentual = tratarPercentual(percentual, 1);
        velocidade = velocidade + (velocidade * percentual);
    }

    public void freiar(double percentual) {
        percentual = tratarPercentual(percentual, 0);
        velocidade = velocidade - (velocidade * percentual);
    }

    public void exibirVelocidade() {
        System.out.println(String.format("A velocidade atual é: %.2f", velocidade));
    }

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirInfo() {
        String message = String.format("Marca: %s. Modelo: %s. Ano: %d.", getMarca(), getModelo(), getAno());
        System.out.println(message);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
