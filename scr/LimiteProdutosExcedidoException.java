package scr;

public class LimiteProdutosExcedidoException extends Exception {
    public LimiteProdutosExcedidoException() {
        super("Limite de produtos excedido. Apenas 5 produtos são permitidos.");
    }
}
