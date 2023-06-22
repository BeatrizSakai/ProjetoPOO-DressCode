package scr;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class InterfaceDressCode extends JFrame {

    private List<Vestido> vestidos;
    private List<JLabel> labelVestidos;
    private List<Calca> calcas;
    private List<JLabel> labelCalcas;
    private List<Camisa> camisas;
    private List<JLabel> labelCamisas;
    private List<Saia> saias;
    private List<JLabel> labelSaias;
    private List<Colar> colares;
    private List<JLabel> labelColares;
    private List<Brinco> brincos;
    private List<JLabel> labelBrincos;
    private List<Pulseira> pulseiras;
    private List<JLabel> labelPulseiras;
    private List<Sandalia> sandalias;
    private List<JLabel> labelSandalias;
    private int i;
    private List<Bota> botas;
    private List<JLabel> labelBotas;
    
    public InterfaceDressCode() {
        setTitle("DRESSCODE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        vestidos = new ArrayList<>();
        vestidos.add(new Vestido("Vestido Branco", "Branco", "P", 150.00, "Curto", true, "Decote U", "imagens\\blusabranca.png", "Vestido branco manga longa"));
        vestidos.add(new Vestido("Vestido Branco", "Branco", "M", 180.00, "Comprido", false, "Decote V", "imagens\\vestidolongo.png", "Vestido Bnco Casual"));
        vestidos.add(new Vestido("Vestido Preto", "PReto", "M", 100.00, "Curto", true, "Decote V", "imagens\\vestidopreto.png", "Vestido Preto Festa"));
        vestidos.add(new Vestido("Vestido Rosa", "Rosa", "G", 120.00, "Curto", true, "Decote V","imagens\\vestidorosa.png", "Vestido Rosa Elegante"));
        labelVestidos = new ArrayList<>();

        calcas = new ArrayList<>();
        calcas.add(new Calca("Calça Jeans", "Azul", "P", 120.00, " Mom", "imagens\\calcamom.png", "Calça Mom"));
        calcas.add(new Calca("Calça Social", "Azul", "M", 180.00, "Corte Reto", "imagens\\calcasocial.png", "Calça Social Elegante"));
        calcas.add(new Calca("Calça Jeans", "Azul", "P", 140.00, "Skin", "imagens\\calcaskin.png", "Calça Jeans Skin"));
        calcas.add(new Calca("Calça Wide Leg", "Preto", "M", 150.00, "Corte Reto", "imagens\\calcawide.png", "Calça Wide Leg"));
        labelCalcas = new ArrayList<>();

        camisas = new ArrayList<>();
        camisas.add(new Camisa("Camisa Branca", "Branca", "M", 80.00, "Manga Longa", false, "imagens\\blusabranca.png", "Camisa Branca Clássica"));
        camisas.add(new Camisa("Camisa Verde", "verde", "P", 90.00, "Manga Curta", false, "imagens\\blusaverde.png", "Camisa Verde Casual"));
        camisas.add(new Camisa("Camisa Rosa", "Rosa", "G", 75.00, "Manga Curta", false, "imagens\\blusarosa.png", "Camisa Rosa Casual "));
        camisas.add(new Camisa("Blusa Inverno", "Azul", "P", 85.00, "Manga Longa", false, "imagens\\blusazul.png", "Camisa Azul Inverno"));
        labelCamisas = new ArrayList<>();

        saias = new ArrayList<>();
        saias.add(new Saia("Saia Fenda", "Verde", "P", 80.00, "Curta", true, "Saia Verde com Fenda", "imagens\\saiafenda.png"));
        saias.add(new Saia("Saia Floral", "Colorido", "M", 75.00, "Média", false, "Saia Floral", "imagens\\saiafloral.png"));
        saias.add(new Saia("Saia Couro", "Preto", "G", 90.00, "Curta", true, "Saia Couro", "imagens\\saiacouro.png"));
        saias.add(new Saia("Saia Rodada", "Marrom", "G", 80.00, "Longa", false, "Saia Rodada Xadrez", "imagens\\saiarodada.png"));
        labelSaias = new ArrayList<>();

        colares = new ArrayList<>();
        colares.add(new Colar("Colar Prata", "Prateado", 60.00, "Prata", "Curto", "imagens\\colarprata.png", "Colar Prata com Brilhante"));
        colares.add(new Colar("Colar Sourado", "Dourado", 40.00, "Malha", "Curto", "imagens\\colardourado.png", "Colar Dourado em Malha"));
        colares.add(new Colar("Colar Perola", "Perolado", 70.00, "Perola", "Curto", "imagens\\colarperola.png", "Colar Prateado Elegante"));
        colares.add(new Colar("Colar Strass", "Brilhante", 35.00, "Strass", "Curto", "imagens\\colarstrass.png", "Gargantilha Strass"));
        labelColares = new ArrayList<>();

        brincos = new ArrayList<>();
        brincos.add(new Brinco("Brinco de Pérola", "Branco", 30.00, "Perola", "Clássico", true, "imagens\\brincoperola.png", "Brinco de Pérola Clássico"));
        brincos.add(new Brinco("Brinco de Argola", "Dourado", 35.00, "Metal", "Argola", true,"imagens\\brincodourado.png" , "Brinco Argola Sobreposta Dourada"));
        brincos.add(new Brinco("Brinco de Pérola", "Branco", 50.00, "Ouro", "Argola", true,"imagens\\brincoprata.png" , "Brinco Argola Moderno Prata"));
        brincos.add(new Brinco("Brinco de Argola", "Brilhante", 40.00, "Metal", "Malha Strass", true, "imagens\\brincostrass.png", "Brinco de Malha Strass"));
        labelBrincos = new ArrayList<>();

        pulseiras = new ArrayList<>();
        pulseiras.add(new Pulseira("Pulseira Brilhante", "Prata", 150.00, "Prata", "Pingentes", true, "imagens\\pulseirabrilhante.png", "Pulseira De Brilhante"));
        pulseiras.add(new Pulseira("Pulseira Ouro", "Dourado", 90.00, "Ouro", "Banhado a ouro", true, "imagens\\pulseiradourada.png", " Pulseira Dupla Banhada a ouro"));
        pulseiras.add(new Pulseira("Pulseira de Perola", "Branco", 60.00, "Perola", "Perolas", true, "imagens\\pulseiraperola.png", "Pulseira de Perola"));
        pulseiras.add(new Pulseira("Pulseira de Couro", "Marrom", 40.00, "Couro", "Fecho Magnético", false, "imagens\\pulseiraprata.png", "Pulseira Dupla de Prata"));
        labelPulseiras = new ArrayList<>();

        sandalias = new ArrayList<>();
        sandalias.add(new Sandalia("Sandalia Rasteira", "Marrom Claro", 36, 89.90, "Tiras", "Rasteiro","imagens\\sandaliarasteira1.png","Sandalia Rasteira Casual"));
        sandalias.add(new Sandalia("Sandalia Salto Alto", "Vermelho", 38, 159.90, "Tiras", "Alto","imagens\\sandaliasalto.png", "Sandalia Salto Alto Elegante"));
        sandalias.add(new Sandalia("Sandalia Rasteira", "Preto", 36, 89.90, "Tiras", "Rasteiro","imagens\\sandaliarasteira.png","Sandalia Rasteira Confortável"));
        sandalias.add(new Sandalia("Sandalia Salto Alto", "Vermelho", 38, 159.90, "Tiras", "Alto","imagens\\sandaliasalto1.png", "Sandalia Salto Alto Elegante"));
        labelSandalias = new ArrayList<>();

        List<Bota> botas = new ArrayList<>();
        botas.add(new Bota("Bota Branca", 37, "Branca", 200.00, "Cano Médio", "Alto", "imagens\\botabranca.png", "Bota Branca "));
        botas.add(new Bota("Coturno Branco", 36, "Branco", 250.00, "Cano Baixo", "Baixo", "imagens\\botacoturno.png", "Bota Preta Cano Médio"));
        botas.add(new Bota("Bota Preta", 37, "Preta", 300.00, "Cano Alto", "Baixo", "imagens\\botalonga.png", "Bota Preta Cano Médio"));
        botas.add(new Bota("Bota Marrom", 35, "Marrom", 150.00, "Cano Médio", "Baixo", "C:\\Users\\emill\\Desktop\\Faculdade_2023\\Java POO\\ProjetoPOO-DressCode\\imagens\\botamarrom.png", "Bota Preta Cano Médio"));
        labelBotas = new ArrayList<>();

        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.PAGE_AXIS));

        JPanel painelVestidos = new JPanel();
        painelVestidos.setLayout(new FlowLayout(FlowLayout.LEFT));
        for (Vestido vestido : vestidos) {
            JLabel labelVestido = new JLabel(new ImageIcon(vestido.getImagem()));
            labelVestido.setHorizontalAlignment(SwingConstants.CENTER);
            labelVestidos.add(labelVestido);

            JPanel painelInformacoesVestido = new JPanel();
            painelInformacoesVestido.setLayout(new GridLayout(4, 1));
            painelInformacoesVestido.add(new JLabel(vestido.getDescricao()));
            painelInformacoesVestido.add(new JLabel("R$" + vestido.getPreco()));
            painelInformacoesVestido.add(new JLabel(""));



            JButton botaoComprarVestido = new JButton("Comprar");
            final int index = i;
            botaoComprarVestido.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Produto produto = vestidos.get(index);
                    Carrinho.add(produto);
                    System.out.println("Produto adicionado ao carrinho: " + produto.getNome());
                }
            });
            painelInformacoesVestido.add(botaoComprarVestido);

            JPanel painelCompleto = new JPanel(new BorderLayout());
            painelCompleto.add(labelVestido, BorderLayout.CENTER);
            painelCompleto.add(painelInformacoesVestido, BorderLayout.SOUTH);

            painelVestidos.add(painelCompleto);
        }
        painelPrincipal.add(painelVestidos);

        JPanel painelCalcas = new JPanel();
        painelCalcas.setLayout(new FlowLayout(FlowLayout.LEFT));
        for (Calca calca : calcas) {
            JLabel labelCalca = new JLabel(new ImageIcon(calca.getImagem()));
            labelCalca.setHorizontalAlignment(SwingConstants.CENTER);
            labelCalcas.add(labelCalca);

            JPanel painelInformacoesCalca = new JPanel();
            painelInformacoesCalca.setLayout(new GridLayout(4, 1));
            painelInformacoesCalca.add(new JLabel(calca.getDescricao()));
            painelInformacoesCalca.add(new JLabel("R$" + calca.getPreco()));
            painelInformacoesCalca.add(new JLabel(""));

            JButton botaoComprarCalca = new JButton("Comprar");
            painelInformacoesCalca.add(botaoComprarCalca);

            JPanel painelCompleto = new JPanel(new BorderLayout());
            painelCompleto.add(labelCalca, BorderLayout.CENTER);
            painelCompleto.add(painelInformacoesCalca, BorderLayout.SOUTH);

            painelCalcas.add(painelCompleto);
        }
        painelPrincipal.add(painelCalcas);

        JPanel painelCamisas = new JPanel();
        painelCamisas.setLayout(new FlowLayout(FlowLayout.LEFT));
        for (Camisa camisa : camisas) {
            JLabel labelCamisa = new JLabel(new ImageIcon(camisa.getImagem()));
            labelCamisa.setHorizontalAlignment(SwingConstants.CENTER);
            labelCamisas.add(labelCamisa);

            JPanel painelInformacoesCamisa = new JPanel();
            painelInformacoesCamisa.setLayout(new GridLayout(4, 1));
            painelInformacoesCamisa.add(new JLabel(camisa.getDescricao()));
            painelInformacoesCamisa.add(new JLabel("R$" + camisa.getPreco()));
            painelInformacoesCamisa.add(new JLabel(""));

            JButton botaoComprarCamisa = new JButton("Comprar");
            painelInformacoesCamisa.add(botaoComprarCamisa);

            JPanel painelCompleto = new JPanel(new BorderLayout());
            painelCompleto.add(labelCamisa, BorderLayout.CENTER);
            painelCompleto.add(painelInformacoesCamisa, BorderLayout.SOUTH);

            painelCamisas.add(painelCompleto);
        }
        painelPrincipal.add(painelCamisas);

        JPanel painelSaias = new JPanel();
        painelSaias.setLayout(new FlowLayout(FlowLayout.LEFT));
        for (Saia saia : saias) {
            JLabel labelSaia = new JLabel(new ImageIcon(saia.getImagem()));
            labelSaia.setHorizontalAlignment(SwingConstants.CENTER);
            labelSaias.add(labelSaia);

            JPanel painelInformacoesSaia = new JPanel();
            painelInformacoesSaia.setLayout(new GridLayout(4, 1));
            painelInformacoesSaia.add(new JLabel(saia.getDescricao()));
            painelInformacoesSaia.add(new JLabel("R$" + saia.getPreco()));
            painelInformacoesSaia.add(new JLabel(""));

            JButton botaoComprarSaia = new JButton("Comprar");
            painelInformacoesSaia.add(botaoComprarSaia);

            JPanel painelCompleto = new JPanel(new BorderLayout());
            painelCompleto.add(labelSaia, BorderLayout.CENTER);
            painelCompleto.add(painelInformacoesSaia, BorderLayout.SOUTH);

            painelSaias.add(painelCompleto);
        }
        painelPrincipal.add(painelSaias);

                JPanel painelColares = new JPanel();
        painelColares.setLayout(new FlowLayout(FlowLayout.LEFT));
        for (Colar colar : colares) {
            JLabel labelColar = new JLabel(new ImageIcon(colar.getImagem()));
            labelColar.setHorizontalAlignment(SwingConstants.CENTER);
            labelColares.add(labelColar);

            JPanel painelInformacoesColar = new JPanel();
            painelInformacoesColar.setLayout(new GridLayout(4, 1));
            painelInformacoesColar.add(new JLabel(colar.getDescricao()));
            painelInformacoesColar.add(new JLabel("R$" + colar.getPreco()));
            painelInformacoesColar.add(new JLabel(""));

            JButton botaoComprarColar = new JButton("Comprar");
            painelInformacoesColar.add(botaoComprarColar);

            JPanel painelCompleto = new JPanel(new BorderLayout());
            painelCompleto.add(labelColar, BorderLayout.CENTER);
            painelCompleto.add(painelInformacoesColar, BorderLayout.SOUTH);

            painelColares.add(painelCompleto);
        }
        painelPrincipal.add(painelColares);

                JPanel painelBrincos = new JPanel();
        painelBrincos.setLayout(new FlowLayout(FlowLayout.LEFT));
        for (Brinco brinco : brincos) {
            JLabel labelBrinco = new JLabel(new ImageIcon(brinco.getImagem()));
            labelBrinco.setHorizontalAlignment(SwingConstants.CENTER);
            labelBrincos.add(labelBrinco);

            JPanel painelInformacoesBrinco = new JPanel();
            painelInformacoesBrinco.setLayout(new GridLayout(4, 1));
            painelInformacoesBrinco.add(new JLabel(brinco.getDescricao()));
            painelInformacoesBrinco.add(new JLabel("R$" + brinco.getPreco()));
            painelInformacoesBrinco.add(new JLabel(""));

            JButton botaoComprarBrinco = new JButton("Comprar");
            painelInformacoesBrinco.add(botaoComprarBrinco);

            JPanel painelCompleto = new JPanel(new BorderLayout());
            painelCompleto.add(labelBrinco, BorderLayout.CENTER);
            painelCompleto.add(painelInformacoesBrinco, BorderLayout.SOUTH);

            painelBrincos.add(painelCompleto);
        }
        painelPrincipal.add(painelBrincos);

                JPanel painelPulseiras = new JPanel();
        painelPulseiras.setLayout(new FlowLayout(FlowLayout.LEFT));
        for (Pulseira pulseira : pulseiras) {
            JLabel labelPulseira = new JLabel(new ImageIcon(pulseira.getImagem()));
            labelPulseira.setHorizontalAlignment(SwingConstants.CENTER);
            labelPulseiras.add(labelPulseira);

            JPanel painelInformacoesPulseira = new JPanel();
            painelInformacoesPulseira.setLayout(new GridLayout(4, 1));
            painelInformacoesPulseira.add(new JLabel(pulseira.getDescricao()));
            painelInformacoesPulseira.add(new JLabel("R$" + pulseira.getPreco()));
            painelInformacoesPulseira.add(new JLabel(""));

            JButton botaoComprarPulseira = new JButton("Comprar");
            painelInformacoesPulseira.add(botaoComprarPulseira);

            JPanel painelCompleto = new JPanel(new BorderLayout());
            painelCompleto.add(labelPulseira, BorderLayout.CENTER);
            painelCompleto.add(painelInformacoesPulseira, BorderLayout.SOUTH);

            painelPulseiras.add(painelCompleto);
        }
        painelPrincipal.add(painelPulseiras);

                JPanel painelSandalias = new JPanel();
        painelSandalias.setLayout(new FlowLayout(FlowLayout.LEFT));
        for (Sandalia sandalia : sandalias) {
            JLabel labelSandalia = new JLabel(new ImageIcon(sandalia.getImagem()));
            labelSandalia.setHorizontalAlignment(SwingConstants.CENTER);
            labelSandalias.add(labelSandalia);

            JPanel painelInformacoesSandalia = new JPanel();
            painelInformacoesSandalia.setLayout(new GridLayout(4, 1));
            painelInformacoesSandalia.add(new JLabel(sandalia.getDescricao()));
            painelInformacoesSandalia.add(new JLabel("R$" + sandalia.getPreco()));
            painelInformacoesSandalia.add(new JLabel(""));

            JButton botaoComprarSandalia = new JButton("Comprar");
            painelInformacoesSandalia.add(botaoComprarSandalia);

            JPanel painelCompleto = new JPanel(new BorderLayout());
            painelCompleto.add(labelSandalia, BorderLayout.CENTER);
            painelCompleto.add(painelInformacoesSandalia, BorderLayout.SOUTH);

            painelSandalias.add(painelCompleto);
        }
        
        painelPrincipal.add(painelSandalias);

                JPanel painelBotas = new JPanel();
        painelBotas.setLayout(new FlowLayout(FlowLayout.LEFT));

        for (Bota bota : botas) {
            JLabel labelBota = new JLabel(new ImageIcon(bota.getImagem()));
            labelBota.setHorizontalAlignment(SwingConstants.CENTER);
            labelBotas.add(labelBota);

            JPanel painelInformacoesBota = new JPanel();
            painelInformacoesBota.setLayout(new GridLayout(4, 1));
            painelInformacoesBota.add(new JLabel(bota.getDescricao()));
            painelInformacoesBota.add(new JLabel("R$" + bota.getPreco()));
            painelInformacoesBota.add(new JLabel(""));

            JButton botaoComprarBota = new JButton("Comprar");
            painelInformacoesBota.add(botaoComprarBota);

            JPanel painelCompleto = new JPanel(new BorderLayout());
            painelCompleto.add(labelBota, BorderLayout.CENTER);
            painelCompleto.add(painelInformacoesBota, BorderLayout.SOUTH);

            painelBotas.add(painelCompleto);
        }

        painelPrincipal.add(painelBotas);


                JScrollPane scrollPane = new JScrollPane(painelPrincipal);
                add(scrollPane);

                setVisible(true);
            }

    public static void main(String[] args) {
         
        new InterfaceDressCode();
        Carrinho carrinho = new Carrinho();
        carrinho.finalizarCompra();;
    }
}
