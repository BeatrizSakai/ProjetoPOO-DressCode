package scr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class FileManager {
  private String caminhoArquivo;
  private Random random = new Random();
  String[][] lista = {
    {"8", "Scouller" + random.nextInt(10)},
    {"9", "Jagoe" + random.nextInt(10),}
  };

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
      for (String[] valor : lista) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < valor.length; i++) {
          line.append(valor[i]);
          if (i != valor.length - 1) {
            line.append(',');
          }
        }
        line.append("\n");
        fileWriter.append(line.toString());
      }
      fileWriter.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

