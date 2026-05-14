package Composicao;

public class Poder {
    
    private String descricao;
    private int dano;

    public Poder(int dano) {
        this.dano = dano;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }    

    public int atacar(){
        return dano;
    }
}
