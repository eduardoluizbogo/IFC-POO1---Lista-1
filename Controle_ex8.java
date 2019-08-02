package aula1;

import java.util.Scanner;

public class Controle_ex8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float n1 = 0,n2 = 0,media = 0;
		System.out.print("Escreva um numero: ");
		n1 = entrada.nextFloat();
		
		System.out.print("Escreva outro numero: ");
		n2 = entrada.nextFloat();
		
		media = (n1+n2)/2;
		
		if(media>=7)
			System.out.println("APROVADO!");
		else
			System.out.println("REPROVADO!");
			

		entrada.close();
	}

}
