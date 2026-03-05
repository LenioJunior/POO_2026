package GettersSetters;

public class OperacoesMatematicas {
    private int numero1, numero2;

    public OperacoesMatematicas(){
        
    }

    public OperacoesMatematicas(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void setNumero1(int numero1){
        this.numero1 = numero1;
    }

    public int getNumero1(){
        return numero1;
    }

    public int getNumero2(){
        return numero2;
    }

    public void setNumero2(int numero2){
        this.numero2 = numero2;
    }

    public int soma(){
        return numero1 + numero2;
    }

    public int subtracao(){
        return numero1 - numero2;
    }
}
