import java.util.Collection;
import java.util.Scanner;

public class teste1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Entrada dos tipos de ativos
    int num = scanner.nextInt();
    String[] ferramentas = new String[num+1];

    for(int i = 0; i < ferramentas.length; i++){
    ferramentas[i] = scanner.nextLine();
    }
    
    for(int indice=0; indice < ferramentas.length; indice++){
    System.out.println(ferramentas[indice]);
    }
}
}
