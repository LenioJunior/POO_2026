package ArrayListas;

import java.lang.reflect.Array;

public class Lista<Tipo> {
    /*
     * Armazenar uma lista de elementos do tipo <Tipo>>
     * Construtor que recebe o tamanho da lista
     * Métodos:
     * Adicionar elemento - add(parametro)
     * Obter um elemento - get(indice)
     * Listar todos os elementos - list()
     * Obter o tamanho da lista - size()
     * Descobrir se um elemento existe na lista - indexOf(parametro)
     */
    private int tamanho;
    private int tamanhoAtual;

    private Tipo[] elementos;

    public Lista(Class<Tipo> clazz, int tamanho) {
        elementos = (Tipo[]) Array.newInstance(clazz, tamanho);
        this.tamanho = tamanho;
        tamanhoAtual = 0;
    }

    public int size(){
        return tamanhoAtual;
    }

    public boolean add(Tipo valor){
        if (tamanhoAtual > tamanho)
            return false;
        
        elementos[tamanhoAtual++] = valor;
        return true;
    }

    public int indexOf(Tipo valor){
        for (int i = 0; i < tamanhoAtual; i++) {
            if (elementos[i] == valor)
                return i;
        }
        return -1;
    }

    public boolean remove(Tipo valor){
        int index = indexOf(valor);
        if (index == -1)
            return false;

        for (int i = index; i < tamanhoAtual - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        elementos[tamanhoAtual] = null;       

        tamanhoAtual--;
        return true;
    }

    public Tipo getAt(int index) throws 
        LenioException, DatabaseNotFoundException, Exception {        
        if (index < 0 || index > tamanhoAtual - 1) {
            // Exception
            throw new Exception("The index was not found!");
        }

        if (index == 6){
            throw new LenioException("Cannot use the number 6");
        }

        if (index == 7){
            throw new DatabaseNotFoundException("The database doesn't exists");
        }
        return elementos[index];
    }

    public void listar(){
        for (int i = 0; i < tamanho; i++) {
            System.out.println(String.format("Elemento %d: %d", (i+1), elementos[i]));
        }
    }
}
