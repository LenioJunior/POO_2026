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

    private int[] elementos;

    public Lista(int tamanho) {
        elementos = new int[tamanho];
        this.tamanho = tamanho;
    }

    public void listar(){
        for (int i = 0; i < tamanho; i++) {
            System.out.println(String.format("Elemento %d: %d", (i+1), elementos[i]));
        }
    }
}
