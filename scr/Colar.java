package scr;

public class Colar extends Acessorio{
    private String comprimento;

    public Colar(String nome, String cor,double preco, String material, String comprimento, String imagem, String descricao){
        super(nome, cor,preco, material, imagem, descricao);
        this.comprimento = comprimento;
    }

    public String getComprimento(){
        return comprimento;
    }

    public void setComprimento(String comprimento){
        this.comprimento = comprimento;
    }
    
}
