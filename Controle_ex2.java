package aula1;

import java.util.Scanner;

public class Controle_ex2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float n1 = 0;
		System.out.println("Digite um número: ");
		n1 = entrada.nextFloat();
		
		if(n1>0)
			System.out.println("Positivo");
		else if(n1<0)
			System.out.println("Negativo");
		else
			System.out.println("Zero");
		
		entrada.close();

	}

}
