package scr;
public class Vestido extends Roupa{
    private String comprimento;
    private boolean manga;
    private String tipo_decote; 

    public Vestido(String nome,String cor, double preco,String tamanho, String comprimento, boolean manga, String tipo_decote, String imagem, String descricao){
        super(nome,cor, preco, tamanho,imagem, descricao);
        this.comprimento = comprimento;
        this.manga = manga;
        this.tipo_decote = tipo_decote;
    }

    public String getComprimento(){
        return comprimento;
    }

    public void setComprimento(String comprimento){
        this.comprimento = comprimento;
    }

    public boolean hasManga(){
        return manga;
    }

    public void setManga(boolean manga){
        this.manga = manga;
    }

    public String getTipo_decote(){
        return tipo_decote;
    }

    public void setTipo_decote(String tipo_decote){
        this.tipo_decote = tipo_decote;
    }
}