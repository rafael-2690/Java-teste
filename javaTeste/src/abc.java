import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();
        String sobrenome = scanner.nextLine();
        int idade = scanner.nextInt();
        double altura = scanner.nextDouble();

        System.out.println("Seu nome é: " + nome + " " + sobrenome);
        System.out.println("Sua idade é: " + idade + " anos");
        System.out.println("Sua altura é de: " + altura + " cm");
    }
}
