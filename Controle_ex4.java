package Lista1;

import java.util.Scanner;

public class Controle_ex4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		System.out.println("Digite um ano para saber se � bissexto ou n�o:");
		num = entrada.nextInt();
		
		if(num % 4 == 0)
			System.out.println("O ano � bissexto");
		else
			System.out.println("O ano n�o � bissexto");
		
		entrada.close();
		
		

	}

}
