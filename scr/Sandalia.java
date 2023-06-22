package scr;

public class Sandalia extends Sapato{
    private String formato;
    private String salto;

    public Sandalia(String nome, String cor,int tamanho, double preco,String formato, String salto, String imagem, String descricao ) {
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
}
