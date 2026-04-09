package Heranca.ListaExerciciosRicardo.Exercicio1;

// - cor: String
// - x: double
// - y: double
// + Figura(cor, x, y)
// + desenhar(): void
// + calcularArea(): double
// + getCor(): String

public class Figura {
    private int id;
    private String cor;
    private double x;
    private double y;
    
    public Figura(String cor, double x, double y) {
        this.cor = cor;
        this.x = x;
        this.y = y;
    }

    public void desenhar(){
        System.out.println("Figura Genérica");
    }

    public double calcularArea(){
        return 0;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        
        if(!(obj.getClass() == Figura.class)){
            return false;
        }

        Figura other = (Figura)obj;
        return getId() == other.getId();
    }

    @Override
    public String toString() {
        return String.format("Figura com id %d e cor %s.", getId(), getCor());
    }
}
