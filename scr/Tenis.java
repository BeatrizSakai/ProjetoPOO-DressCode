package scr;

public class Tenis extends Sapato {
    private String fechamento;
     
    public Tenis(String nome, int tamanho, String cor, double preco,String fechamento, String imagem, String descricao ) {
        super(nome,cor,preco,tamanho, imagem, descricao);
        this.fechamento = fechamento;
    }
    public String getFechamento() {
        return fechamento;
    }

    public void setFechamento(String fechamento) {
        this.fechamento = fechamento;
    }


}
