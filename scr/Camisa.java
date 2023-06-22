package scr;
public class Camisa extends Roupa{
    private String tipo_manga;
    private boolean gola;

    public Camisa(String nome, String cor, String tamanho, double preco, String tipo_manga, boolean gola, String imagem, String descricao){
        super(nome, cor, preco, tamanho,imagem, descricao);
        this.tipo_manga = tipo_manga;
        this.gola = gola;
    }

    public String getTipo_manga(){
        return tipo_manga;
    }

    public void setTipo_manga(String tipo_manga){
        this.tipo_manga = tipo_manga;
    }

    public boolean getGola(){
        return gola;
    }

    public void setGola(boolean gola){
        this.gola = gola;
    }

    public Produto get(int index) {
        return null;
    }
}
