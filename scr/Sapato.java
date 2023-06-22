package scr;

public class Sapato extends Produto {
    private int tamanho;

    public Sapato(String nome, String cor, double preco, int tamanho,  String imagem, String descricao) {
        super(nome,cor, preco, imagem, descricao);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void escolherProduto() {
        System.out.println("Escolhendo seu sapato...");
    }

    @Override
    public void devolverProduto() {
        System.out.println("Realizando a devolução do seu sapato...");
    }
}