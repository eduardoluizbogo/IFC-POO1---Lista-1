package Lista1;

import java.util.Scanner;

public class Controle_ex5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		char letra = ' ';
		System.out.println("Digite uma letra para saber se � vogal ou n�o: ");
		letra = entrada.nextLine().charAt(0);
		
		if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
			System.out.println("Vogal");
		else
			System.out.println("N�o vogal");

		entrada.close();
	}

}
