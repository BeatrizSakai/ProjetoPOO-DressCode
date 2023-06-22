package scr;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;



public class FileManager {
  private String caminhoArquivo;
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
        System.out.println("ID do pedido: " + dadoTratado.get(0));
        System.out.println("Valor do pedido: " + dadoTratado.get(1));
      }
      br.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
public void escreveArquivo(List<Object> lista) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
        for (Object item : lista) {
            writer.write(item.toString());
            writer.newLine();
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}