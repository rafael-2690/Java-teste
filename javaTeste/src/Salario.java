import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Salario {
    public static void main(String[] args) {
    
        String [] canditados = {"Vagner", "Marcela", "Julia", "Penelope", "Rafael"};

        for(int i = 0; i <= canditados.length; i++){
            entrandoContato(canditados[i]);
        }
    }
    static void entrandoContato(String candidados){
        int tentativa = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu=atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativa++;
            }
        }while(continuarTentando && tentativa<3);
        if(atendeu){
            System.out.println("Conseguimos contato com " + candidados + " na tentativa: " + tentativa);
        }
        else{
            System.out.println("Não conseguimos contato com " + candidados + ", numero maximo tentativas: " + tentativa);
        }

    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] canditados = {"Vagner", "Marcela", "Julia", "Penelope", "Rafael"};
            System.out.println("Imprimindo a lista de canditados selecionados informando seus indices.");

        for(int indice = 0; indice < canditados.length; indice++){
            
            System.out.println("O candidado nº " + (indice+1) + " é o " + canditados[indice]);
        }
    }

    static void selecaoCandidatos(){
        String [] canditados = {"Vagner", "Marcela", "Julia", "Penelope", "Rafael", "João", "Marcos", "Ivan", "Manuella", "Maria"};

        int candidatoslecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatoslecionados < 5 && candidatoAtual < canditados.length){
          String candidato = canditados[candidatoAtual];
          double valorPretendido = salarioPretendido();
          
          System.out.println("O candidato " + candidato + " Solicitou este, valor de salário " + valorPretendido);

          if(salarioBase>=valorPretendido){
            System.out.println("O canditado " + candidato + " foi selecionado para a vaga.");
            candidatoslecionados++;
          }else{
            System.out.println("O canditado " + candidato + " não foi selecionado para a vaga.");
          }
            candidatoAtual++;
        }
    }

    static double salarioPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase>salarioPretendido){
            System.out.println("Ligar para o candidato.");
        }
        else if(salarioBase==salarioPretendido){
            System.out.println("Ligar para candidato com contra proposta.");
        }
        else{
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
    }
