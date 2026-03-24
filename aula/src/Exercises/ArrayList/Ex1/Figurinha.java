package Exercises.ArrayList.Ex1;

public class Figurinha {

    private int numero;

    private int quantidade;

    public void exibirFigurinha(){
        String msg = String.format("Figurinha com numero: %d. Quantidade: %d", numero, quantidade);
        System.out.println(msg);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }    
}
