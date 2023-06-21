package scr;
public abstract class Produto {
    private String nome;
    private String cor;
    private double preco;
    private String imagem;
    private String descricao;

    public Produto(String nome, String cor, double preco, String imagem, String descricao) {
        this.nome = nome;
        this.cor = cor;
        this.preco = preco;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getImagem(){
        return imagem;
    }

    public void setImagem(String imagem){
        this.imagem = imagem;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public abstract void escolherProduto();

    public abstract void devolverProduto();
}
