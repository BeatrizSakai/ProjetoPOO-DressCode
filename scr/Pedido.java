package scr;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pedido { 
    public static List<Object> finalizarPedido() {
    double valor_pedido = Carrinho.calculaValorTotal();

    List<Object> lista = new ArrayList<>();
    Random random = new Random();
    int id = random.nextInt();
    lista.add(id);
    lista.add(valor_pedido);
    lista.add(",");
    return lista;
    }
}


