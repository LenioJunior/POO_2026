package Composicao;

import java.util.ArrayList;

public class Heroi {
    private String nome;

    private int vida;

    private ArrayList<Poder> poderes;

    public Heroi(int vida) {
        poderes = new ArrayList<>();
        this.vida = vida;
    }

    public void addPoder(Poder poder){
        poderes.add(poder);
    }

    public void delPoder(Poder poder){
        poderes.remove(poder);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Poder> getPoderes() {
        return poderes;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
