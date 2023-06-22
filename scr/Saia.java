package scr;

public class Saia extends Roupa {
    private int comprimento;
    private boolean fenda;

    public Saia(String nome, String cor, String tamanho, double preco, int comprimento, boolean fenda, String descricao, String imagem) {
        super(nome,cor, preco, tamanho, imagem, descricao);
        this.comprimento = comprimento;
        this.fenda = fenda;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public boolean getFenda() {
        return fenda;
    }

    public void setFenda(boolean fenda) {
        this.fenda = fenda;
    }
}
