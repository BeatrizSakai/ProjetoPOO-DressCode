package scr;

public class Acessorio extends Produto{
    private String material;

    public Acessorio(String nome, String cor, double preco, String material, String imagem, String descricao) {
        super(nome, cor, preco, imagem, descricao);
        this.material = material;
    }
    
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void escolherProduto() {
        System.out.println("Escolhendo sua peça de acessorio...");
    }

    @Override
    public void devolverProduto() {
        System.out.println("Realizando a devolução da sua peça de acessorio...");
    }
}
