package GettersSetters;

public class Carro {

    private int ano;

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        //this.ano = ano;
    }

    public boolean isAntigo(){
        // O carro é antigo se tem mais que 5 anos.
        return ano > 5;
    }
}
