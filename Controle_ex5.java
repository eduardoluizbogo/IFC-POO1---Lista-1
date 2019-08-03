package Lista1;

import java.util.Scanner;

public class Controle_ex5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		char letra = ' ';
		System.out.println("Digite uma letra para saber se é vogal ou não: ");
		letra = entrada.nextLine().charAt(0);
		
		if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
			System.out.println("Vogal");
		else
			System.out.println("Não vogal");

		entrada.close();
	}

}
