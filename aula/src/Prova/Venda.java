package Prova;

public class Venda {
    private Produto produto;
    private int quantidade;

    public Venda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularTotal() {
        return produto.getPreco() * quantidade;
    }

    public boolean realizarVenda() {
        return produto.retirarDoEstoque(quantidade);
    }

}
