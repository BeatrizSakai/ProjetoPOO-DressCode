package scr;

public class Pulseira extends Acessorio{
    private String ornamento;
    private boolean fecho;

    public Pulseira(String nome, String cor,double preco, String material, String ornamento, boolean fecho,String imagem, String descricao){
        super(nome, cor,preco, material,imagem, descricao);
        this.ornamento = ornamento;
        this.fecho = fecho;
    }

    public String getOrnamento(){
        return ornamento;
    }

    public void setOrnamento(String ornamento){
        this.ornamento = ornamento;
    }

    public boolean getFecho(boolean fecho) {
    this.fecho = fecho;
    return this.fecho;
}


}
