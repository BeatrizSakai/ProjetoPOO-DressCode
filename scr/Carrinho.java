package scr;
import java.util.ArrayList;



public class Carrinho {
    public static Carrinho carrinho;
    private ArrayList<Object> produtos;
    private double valorTotal;
    public Carrinho() {
        produtos = new ArrayList<>();
        this.valorTotal = 0;
    }

    public void adicionaProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("O " + produto.getNome() + " foi adicionado com sucesso!");
    }
    public void calculaValorTotal() {
        for (var produto: produtos) {
            valorTotal += ((Produto) produto).getPreco();
        }
        System.out.println("o valor total é: " + valorTotal);
    }

    public void finalizarCompra(){
        System.out.println("Compra finalizada!");
    }
    
}

