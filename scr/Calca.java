package scr;
public class Calca extends Roupa{
    private String modelo;

    Calca(String nome,String cor, String tamanho, double preco, String modelo, String imagem, String descricao){
        super(nome,cor, preco, tamanho, imagem, descricao);
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo; 
    }

    public Produto get(int index) {
        return null;
    }
}