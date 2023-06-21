package scr;
public class Calca extends Roupa{
    private String modelo;

    private Calca(String nome,String cor, String tamanho, double preco, String modelo){
        super(nome,cor, preco, tamanho);
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo; 
    }
}