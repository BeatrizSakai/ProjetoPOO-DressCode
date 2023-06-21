package scr;

public class Roupa extends Produto {
    private String tamanho;

    public Roupa(String nome, String cor, double preco, String tamanho) {
        super(nome, cor, preco);
        this.tamanho = tamanho;
    }
    
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void escolherProduto() {
        System.out.println("Escolhendo sua peça de roupa...");
    }

    @Override
    public void devolverProduto() {
        System.out.println("Realizando a devolução da sua peça de roupa...");
    }
}
