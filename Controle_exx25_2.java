package Lista1;

import java.util.Scanner;

public class Controle_exx25_2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		int aux = 0;
		
		System.out.println("Insira um numero inteiro");
		num = entrada.nextInt();
		
		aux = num % 2;
		if(aux == 0)
			System.out.println("O numero e par");
		else
			System.out.println("O numero e impar");
		
		entrada.close();

	}

}
