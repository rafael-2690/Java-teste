import java.text.DecimalFormat;
import java.util.Scanner;

public class bancoteste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
   
        double valorInicial = scanner.nextDouble();
        
     
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        double jurosMult = taxaJuros * periodo;
        
        double resultadoJuros = jurosMult * valorInicial;
        
        double resultadoFinal = resultadoJuros + valorInicial;

        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        


        System.out.println("Valor final do investimento: R$ " + (resultadoFinal));
        
        scanner.close();
    }
}