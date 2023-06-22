package scr;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();

        try {
            Vestido vestido = new Vestido("Vestido Ana", "rosa", "PP", 50.99, "curto", false, "V", null, null);
            carrinho.adicionaProduto(vestido);
            Carrinho.calculaValorTotal();
            FileManager fm = new FileManager("./database/pedido.txt");
            List<Object> lista = Pedido.finalizarPedido();
            fm.escreveArquivo(lista);
            fm.lerArquivoBufferedReader();
        }  
        catch (LimiteProdutosExcedidoException e) {
            System.out.println("Erro: Limite de produtos excedido. Apenas 5 produtos são permitidos.");
        }
    }
}
