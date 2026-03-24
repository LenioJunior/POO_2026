package ArrayListas;

public class Lista {
    /*
     * Armazenar uma lista de elementos do tipo inteiro
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

    private Integer[] elementos;

    public Lista(int tamanho) {
        elementos = new Integer[tamanho];
        this.tamanho = tamanho;
        tamanhoAtual = 0;
    }

    public int size(){
        return tamanhoAtual;
    }

    public boolean add(int valor){
        if (tamanhoAtual > tamanho)
            return false;
        
        elementos[tamanhoAtual++] = valor;
        return true;
    }

    public int indexOf(int valor){
        for (int i = 0; i < tamanhoAtual; i++) {
            if (elementos[i] == valor)
                return i;
        }
        return -1;
    }

    public boolean remove(int valor){
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

    public int getAt(int index){        
        if (index < 0 || index > tamanhoAtual - 1) {
            return -1;
        }
        return elementos[index];
    }

    public void listar(){
        for (int i = 0; i < tamanho; i++) {
            System.out.println(String.format("Elemento %d: %d", (i+1), elementos[i]));
        }
    }
}
