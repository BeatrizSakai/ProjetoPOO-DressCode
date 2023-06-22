package scr;

public class Saia extends Roupa {
    private String comprimento;
    private boolean fenda;

    public Saia(String nome, String cor, String tamanho, double preco, String comprimento, boolean fenda, String descricao, String imagem) {
        super(nome,cor, preco, tamanho, imagem, descricao);
        this.comprimento = comprimento;
        this.fenda = fenda;
    }

    public String getComprimento() {
        return comprimento;
    }

    public void setComprimento(String comprimento) {
        this.comprimento = comprimento;
    }

    public boolean getFenda() {
        return fenda;
    }

    public void setFenda(boolean fenda) {
        this.fenda = fenda;
    }
}
