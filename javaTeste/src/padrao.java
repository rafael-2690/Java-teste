import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class padrao {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    

    //Entrada dos tipos de ativos
    int quantidadeAtivos = scanner.nextInt();
    String[] ativos = new String[quantidadeAtivos+1];

    // Entrada dos códigos dos ativos
    for (int i = 0; i < ativos.length; i++) {
      String codigoAtivo = scanner.nextLine();
      ativos[i] = codigoAtivo;
    }

    //TODO: Ordenar os ativos em ordem alfabética.
    Collections.sort(ativos[]);

    //TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
    for (int indice = 0; indice < ativos.length; indice++) {
      System.out.println(ativos[indice]);
    }
  }
}

