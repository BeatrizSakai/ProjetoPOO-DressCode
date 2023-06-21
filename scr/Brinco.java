package scr;
public class Brinco extends Acessorio{
    private String modelo;
    private boolean tarracha;

    public Brinco(String nome, String cor,double preco, String material, String modelo, boolean tarracha, String imagem, String descricao){
        super(nome, cor,preco, material,imagem, descricao);
        this.modelo = modelo;
        this.tarracha = tarracha;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public boolean hasTarracha(){
        return tarracha;
    }

    public void setTarracha( boolean tarracha){
        this.tarracha = tarracha;
    }

} 
