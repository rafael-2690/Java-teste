import java.util.concurrent.ThreadLocalRandom;

public class Salario {
    public static void main(String[] args) {
    
        analisarCandidato(salarioPretendido());

        
        
    }
    static double salarioPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
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
