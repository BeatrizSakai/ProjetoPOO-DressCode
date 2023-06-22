package scr;
import java.util.ArrayList;
import scr.LimiteProdutosExcedidoException;

public class Carrinho {
    public static Carrinho carrinho;
    private static ArrayList<Object> produtos;
    private static double valorTotal;
    private static final int LIMITE_PRODUTOS = 5;

    public Carrinho() {
        produtos = new ArrayList<>();
        Carrinho.valorTotal = 0;
    }

public void adicionaProduto(Produto produto) throws LimiteProdutosExcedidoException {
    produtos.add(produto);
    if (produtos.size() >= LIMITE_PRODUTOS) {
        System.out.println("Limite de produtos excedido. Apenas 5 produtos são permitidos.");
        throw new LimiteProdutosExcedidoException();
        
    }
    System.out.println("O " + produto.getNome() + " foi adicionado com sucesso!");
}

    public static double calculaValorTotal() {
        for (var produto: produtos) {
            valorTotal += ((Produto) produto).getPreco();
        }
        return valorTotal;
    }

    public void finalizarCompra(){
        System.out.println("Compra finalizada!");
        System.out.println("Produtos no carrinho: " + produtos);
    }

    public static void add(Produto produto) {
    }
    
}

