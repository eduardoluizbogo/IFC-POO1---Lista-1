package aula1;

import java.util.Scanner;


public class Controle_ex1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		float n1=0;
		System.out.println("Escreva um número: ");
		n1 = entrada.nextFloat();
		
		float n2=0;
		System.out.println("Escreva outro número: ");
		n2 = entrada.nextFloat();
		
		if(n1>n2)
			System.out.println("O maior número é: "+n1);
		else if(n1<n2)
			System.out.println("O maior número é: "+n2);
		else
			System.out.println("O numeros são iguais,sendo: "+n1);

		entrada.close();
	}

}
