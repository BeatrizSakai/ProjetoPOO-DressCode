package scr;

public class pulseira extends Acessorio{
    private String material;
    private String ornamento;
    private boolean fecho;

    public pulseira(String material, String ornamento, boolean fecho, double preco,String comprimento, String imagem){
        super(material, ornamento, fecho, preco, imagem, descricao)
        this.material = material;
        this.ornamento = ornamento;
        this.fecho = fecho;
    }

    public String getMaterial(){
        return material;
    }

    public String setMaterial(String material){
        this.material = material;
    }

    public String getOrnamento(){
        return ornamento;
    }

    public String setOrnamento(String ornamento){
        this.ornamento = ornamento;
    }

    public boolean hasFecho(){
        return fecho;
    }

    public boolean getFecho(boolean fecho){
        this.fecho = fecho;
    }