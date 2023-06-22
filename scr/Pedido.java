package scr;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pedido { 
    public static List<Object> finalizarPedido() {
    List<Object> lista = new ArrayList<>();
    Random random = new Random();
    int id = random.nextInt(10);
    double valor_pedido = Carrinho.calculaValorTotal();
    String idEValor = id + "," + valor_pedido;
    lista.add(idEValor);
    return lista;
}
}


