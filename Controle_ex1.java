package aula1;

import java.util.Scanner;


public class Controle_ex1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		float n1=0;
		System.out.println("Escreva um n�mero: ");
		n1 = entrada.nextFloat();
		
		float n2=0;
		System.out.println("Escreva outro n�mero: ");
		n2 = entrada.nextFloat();
		
		if(n1>n2)
			System.out.println("O maior n�mero �: "+n1);
		else if(n1<n2)
			System.out.println("O maior n�mero �: "+n2);
		else
			System.out.println("O numeros s�o iguais,sendo: "+n1);

		entrada.close();
	}

}
