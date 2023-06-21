package scr;

public class Bota extends Sapato {
    private String cano;
    private String salto;

    public Bota(String nome,int tamanho, String cor, double preco,String cano, String salto, String imagem, String descricao ) {
        super(nome,cor,preco, tamanho, imagem, descricao);
        this.cano = cano;
        this.salto = salto;
    }
    public String getCano(){
        return cano;
    }
    public void setCano(String cano){
        this.cano = cano;
    }
    public String getSalto(){
        return salto;
    }
    public void setSalto(String salto){
        this.salto = salto;
    }

    
}


