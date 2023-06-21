package scr;

public class Sandalia extends Sapato{
    private String formato;
    private String salto;
     private String imagem;
    private String descricao;

    public Sandalia(String nome,int tamanho, String cor, double preco,String formato, String salto, String imagem, String descricao ) {
        super(nome, cor, preco, tamanho, imagem, descricao);
        this.formato = formato;
        this.salto = salto;
    }
    public String getFormato(){
        return formato;
    }
    public void setFormato(String formato){
        this.formato = formato;
    }
    public String getSalto(){
        return salto;
    }
    public void setSalto(String salto){
        this.salto = salto;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
