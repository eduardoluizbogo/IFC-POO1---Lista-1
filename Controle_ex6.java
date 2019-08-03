package Lista1;

import java.util.Scanner;

public class Controle_ex6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		System.out.println("Escreva um numero inteiro: ");
		num = entrada.nextInt();
		
		System.out.println(num+1);
		
		entrada.close();


	}

}
