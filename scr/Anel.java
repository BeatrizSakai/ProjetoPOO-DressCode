package scr;

public class Anel extends Acessorio{
    private String pedra;
    private int aro;
    
    public Anel(String nome,String cor, String material, String pedra, int aro, double preco, String imagem, String descricao){
        super(nome, cor, preco, material, imagem, descricao);
        this.pedra = pedra;
        this.aro = aro;
    }


    public String getPedra(){
        return pedra;
    }

    public void setPedra(String pedra){
        this.pedra = pedra;
    }

    public int getAro(){
        return aro;
    }

    public void setAro(int aro){
        this.aro = aro;
    }

}
