package scr;

public class LimiteProdutosExcedidoException extends Exception {
    private int limiteMaximo;

    public LimiteProdutosExcedidoException(int limiteMaximo) {
        super("Limite de produtos excedido. Apenas " + limiteMaximo + " produtos são permitidos.");
        this.limiteMaximo = limiteMaximo;
        limiteMaximo = 5;
    }

    public int getLimiteMaximo() {
        return limiteMaximo;
    }
}

