
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(scanner.nextInt());
		numeros.add(scanner.nextInt());
		numeros.add(scanner.nextInt());
		numeros.add(scanner.nextInt());
		
		Iterator<Integer> iterator = numeros.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		int soma = 0;
		for (Integer n : numeros) {
		    soma += n.intValue();
		}
		System.out.println("A soma é " + soma);
	}

}