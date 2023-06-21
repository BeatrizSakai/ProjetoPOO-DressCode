package scr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;



public class FileManager {
  private String caminhoArquivo;
  List<Object> lista = Pedido.finalizarPedido();

  public FileManager(String caminhoArquivo) {
    this.caminhoArquivo = caminhoArquivo;
  }

  public void lerArquivoBufferedReader() {
    try {
      FileReader arquivo = new FileReader(caminhoArquivo);
      BufferedReader br = new BufferedReader(arquivo);
      while (br.ready()) {
        String dado = br.readLine();
        String[] dadoSeparado = dado.split(",");
        List<String> dadoTratado = Arrays.asList(dadoSeparado);
        System.out.println("ID: " + dadoTratado.get(0));
        System.out.println("Valor: " + dadoTratado.get(1));
      }
      br.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  public void escreveArquivo() {
    File arquivo = new File(caminhoArquivo);
    try {
      FileWriter fileWriter = new FileWriter(arquivo, true);
    }
}
}


