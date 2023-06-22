package scr;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        Vestido vestido = new Vestido("Vestido Ana", "rosa", "PP", 50.99, "curto", false, "V", null, null);
        carrinho.adicionaProduto(vestido);
        Carrinho.calculaValorTotal();
        FileManager fm = new FileManager("./database/pedido.txt");
        List<Object> lista = Pedido.finalizarPedido();
        fm.escreveArquivo(lista);
        fm.lerArquivoBufferedReader();


    }
}
