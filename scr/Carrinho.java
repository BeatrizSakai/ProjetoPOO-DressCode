package scr;
import java.util.ArrayList;



public class Carrinho {
    public static Carrinho carrinho;
    private static ArrayList<Object> produtos;
    private static double valorTotal;

    public Carrinho() {
        produtos = new ArrayList<>();
        Carrinho.valorTotal = 0;
    }

    public void adicionaProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("O " + produto.getNome() + " foi adicionado com sucesso!");
    }
    public static double calculaValorTotal() {
        for (var produto: produtos) {
            valorTotal += ((Produto) produto).getPreco();
        }
        System.out.println("o valor da sua compra é: " + valorTotal);
        return valorTotal;
    }

    public void finalizarCompra(){
        System.out.println("Compra finalizada!");
    }
    
}

