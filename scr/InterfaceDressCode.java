package scr;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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


    public InterfaceDressCode() {
        setTitle("DRESSCODE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        vestidos = new ArrayList<>();
        vestidos.add(new Vestido("Vestido Branco", "Branco", "P", 150.00, "Curto", true, "Decote U", "C:\\Users\\emill\\Desktop\\Faculdade_2023\\Java POO\\DressCode-PjBL-8\\imagens\\vestidobranco.png", "Vestido branco manga longa"));
        vestidos.add(new Vestido("Vestido Branco", "Branco", "M", 180.00, "Comprido", false, "Decote V", "C:\\Users\\emill\\Desktop\\Faculdade_2023\\Java POO\\DressCode-PjBL-8\\imagens\\vestidolongo.png", "Vestido Barnco Casual"));
        vestidos.add(new Vestido("Vestido Preto", "PReto", "M", 100.00, "Curto", true, "Decote V", "C:\\Users\\emill\\Desktop\\Faculdade_2023\\Java POO\\DressCode-PjBL-8\\imagens\\vestidopreto.png", "Vestido Preto Festa"));
        vestidos.add(new Vestido("Vestido Rosa", "Rosa", "G", 120.00, "Curto", true, "Decote V","C:\\Users\\emill\\Desktop\\Faculdade_2023\\Java POO\\DressCode-PjBL-8\\imagens\\vestidorosa.png", "Vestido Rosa Elegante"));
        labelVestidos = new ArrayList<>();

        calcas = new ArrayList<>();
        calcas.add(new Calca("Calça Jeans", "Azul", "P", 120.00, " Mom", "C:\\Users\\emill\\Desktop\\Faculdade_2023\\Java POO\\DressCode-PjBL-8\\imagens\\calcamom.png", "Calça Mom"));
        calcas.add(new Calca("Calça Social", "Azul", "M", 180.00, "Corte Reto", "C:\\Users\\emill\\Desktop\\Faculdade_2023\\Java POO\\DressCode-PjBL-8\\imagens\\calcasocial.png", "Calça Social Elegante"));
        calcas.add(new Calca("Calça Jeans", "Azul", "P", 140.00, "Skin", "C:\\Users\\emill\\Desktop\\Faculdade_2023\\Java POO\\DressCode-PjBL-8\\imagens\\calcaskin.png", "Calça Jeans Skin"));
        calcas.add(new Calca("Calça Wide Leg", "Preto", "M", 150.00, "Corte Reto", "C:\\Users\\emill\\Desktop\\Faculdade_2023\\Java POO\\DressCode-PjBL-8\\imagens\\calcawide.png", "Calça Wide Leg"));
        labelCalcas = new ArrayList<>();

        camisas = new ArrayList<>();
        camisas.add(new Camisa("Camisa Branca", "Branca", "M", 80.00, "Manga Longa", false, "C:\\Users\\emill\\Desktop\\Faculdade_2023\\Java POO\\DressCode-PjBL-8\\imagens\\blusabranca.png", "Camisa Branca Clássica"));
        camisas.add(new Camisa("Camisa Verde", "verde", "P", 90.00, "Manga Curta", false, "C:\\Users\\emill\\Desktop\\Faculdade_2023\\Java POO\\DressCode-PjBL-8\\imagens\\blusaverde.png", "Camisa Verde Casual"));
        camisas.add(new Camisa("Camisa Rosa", "Rosa", "G", 75.00, "Manga Curta", false, "C:\\Users\\emill\\Desktop\\Faculdade_2023\\Java POO\\DressCode-PjBL-8\\imagens\\blusarosa.png", "Camisa Rosa Casual "));
        camisas.add(new Camisa("Camisa Listrada", "Preto e Branco", "P", 85.00, "Manga Longa", false, "C:\\Users\\emill\\Desktop\\Faculdade_2023\\Java POO\\DressCode-PjBL-8\\imagens\\blusazul.png", "Camisa Azul Inverno"));
        labelCamisas = new ArrayList<>();

        saias = new ArrayList<>();
        saias.add(new Saia("Saia Fenda", "Jeans", "P", 60.00, "Curta", rootPaneCheckingEnabled, "C:\\Users\\emill\\Desktop\\Faculdade_2023\\Java POO\\DressCode-PjBL-8\\imagens\\saiafenda.png", "Saia Fenda Verde"));
        saias.add(new Saia("Saia Floral", "Colorido", "M", 75.00, "Comprido", rootPaneCheckingEnabled, "C:\\Users\\emill\\Desktop\\Faculdade_2023\\Java POO\\DressCode-PjBL-8\\imagens\\saiafloral.png", "Saia Floral"));
        saias.add(new Saia("Saia Couro", "Preto", "G", 90.00, "Curta", rootPaneCheckingEnabled, "C:\\Users\\emill\\Desktop\\Faculdade_2023\\Java POO\\DressCode-PjBL-8\\imagens\\saiacouro.png", "Saia Couro Preta"));
        saias.add(new Saia("Saia Rodada", "Marrom", "G", 80.00, "Rodada", rootPaneCheckingEnabled, "C:\\Users\\emill\\Desktop\\Faculdade_2023\\Java POO\\DressCode-PjBL-8\\imagens\\saiarodada.png", "Saia Rodada Xadrez"));
        labelSaias = new ArrayList<>();

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

        JScrollPane scrollPane = new JScrollPane(painelPrincipal);
        add(scrollPane);

        setVisible(true);
    }

    public static void main(String[] args) {
        new InterfaceDressCode();
    }
}
