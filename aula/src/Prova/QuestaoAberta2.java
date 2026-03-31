package Prova;
public class QuestaoAberta2 {
    public static void main(String[] args) {

        Produto p1 = new Produto("Mouse", 100, 10);
        Produto p2 = new Produto("Teclado", 200, 1);

        Venda v1 = new Venda(p1, 2);
        Venda v2 = new Venda(p2, 2);

        boolean venda1 = v1.realizarVenda();
        boolean venda2 = v2.realizarVenda();

        System.out.println("Venda 1 realizada: " + venda1);
        System.out.println("Total venda 1: " + v1.calcularTotal());
        System.out.println("Estoque Mouse: " + p1.getEstoque());

        System.out.println();

        System.out.println("Venda 2 realizada: " + venda2);
        System.out.println("Total venda 2: " + v2.calcularTotal());
        System.out.println("Estoque Teclado: " + p2.getEstoque());
    }

}
