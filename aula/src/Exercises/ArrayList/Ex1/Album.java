package Exercises.ArrayList.Ex1;

import java.util.ArrayList;

import ArrayListas.ArrayLista;
import ArrayListas.LenioException;

public class Album {

    private ArrayList<Figurinha> figurinhas;
    private String name;
    ArrayLista aa;
    LenioException l;

    public Album() {
        figurinhas = new ArrayList<>();
    }

    public int getNumeroFigurinhas(){
        int total = 0;
        // Vou mostrar 2 métodos de iterar nas figurinhas:

        // 1) ForEach
        for (Figurinha figurinha : figurinhas) {
            total += figurinha.getQuantidade();
        }

        // 2) For comum        
        for (int index = 0; index < figurinhas.size(); index++) {
            Figurinha figurinha = figurinhas.get(index);
            total += figurinha.getQuantidade();

            // As 2 linhas acima podem ser simplificadas para:
            // total += figurinhas.get(index).getQuantidade();

            // Lembrando que deve ser usada uma das opções, do contrário estaremos somando 2 vezes a quantidade.
        }
        return total;
    }

    public void exibirAlbum(){
        String messageFormatter = "Figurinha Número '%d' e Quantidade '%d'.%s";
        String message = "";
        // Vou mostrar 2 métodos de iterar nas figurinhas:

        // 1) ForEach
        for (Figurinha figurinha : figurinhas) {
            message += String.format(messageFormatter, figurinha.getNumero(), figurinha.getQuantidade(), System.lineSeparator());
        }

        // 2) For comum
        for (int i = 0; i < figurinhas.size(); i++) {
            //Figurinha figurinha = figurinhas.get(i);
            //message += String.format(messageFormatter, figurinha.getNumero(), figurinha.getQuantidade(), System.lineSeparator());
        }

        // Lembrando que deve ser usada uma das opções, do contrário estaremos exibindo 2 vezes as informações de cada figurinha.

        System.out.println("Album: " + getName());
        System.out.println(message);
    }

    public boolean addFigurinha(Figurinha figurinha){
        if(figurinha == null)
            return false;

        return figurinhas.add(figurinha);
    }

    public ArrayList<Figurinha> getFigurinhas() {
        return figurinhas;
    }

    public void setFigurinhas(ArrayList<Figurinha> figurinhas) {
        this.figurinhas = figurinhas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    
}
