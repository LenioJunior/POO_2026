package Exercises.ArrayList.Ex1;

import java.util.ArrayList;

public class Ex1 {

    public static void main(String[] args) {
        exemploLista();
        resolucaoExercicio();
    }

    private static void exemploLista() {
        System.out.println("---- Exemplo Lista ----");

        ArrayList<Figurinha> figurinhas = new ArrayList<>();

        Figurinha fig1 = new Figurinha();
        fig1.setNumero(1);
        fig1.setQuantidade(10);
        figurinhas.add(fig1);

        fig1.exibirFigurinha();

        Figurinha fig2 = new Figurinha();
        fig2.setNumero(2);
        fig2.setQuantidade(5);
        figurinhas.add(fig2);

        Figurinha outroNome = figurinhas.get(0);
        System.out.println(String.format("Figura: %d. Quantidade: %d",
                outroNome.getNumero(), outroNome.getQuantidade()));
    }    

    private static void resolucaoExercicio() {
        System.out.println("---- Resolução Exercício ----");

        Album album1 = new Album();
        album1.setName("Album Infância");
        Figurinha figurinha1 = new Figurinha();
        figurinha1.setNumero(1);
        figurinha1.setQuantidade(10);

        Figurinha figurinha2 = new Figurinha();
        figurinha2.setNumero(2);
        figurinha2.setQuantidade(5);

        album1.addFigurinha(figurinha1);
        album1.addFigurinha(figurinha2);
        album1.exibirAlbum();

        Album album2 = new Album();
        album2.setName("Album Adolescência");
        Figurinha figurinha3 = new Figurinha();
        figurinha3.setNumero(3);
        figurinha3.setQuantidade(7);
        Figurinha figurinha4 = new Figurinha();
        figurinha4.setNumero(4);
        figurinha4.setQuantidade(12);

        album2.addFigurinha(figurinha3);
        album2.addFigurinha(figurinha4);
        album2.exibirAlbum();
    }
}
