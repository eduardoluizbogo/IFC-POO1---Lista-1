package Lista1;

import java.util.Scanner;

public class Controle_exx22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int num=0;
		int centena=0;
		int dezena=0;
		int unidade=0;
		
		System.out.println("Insira um numero inteiro menor que 1000: ");
		num = entrada.nextInt();
		
		
		if(num < 1000) {
		centena = num /100;
		System.out.println("centena: "+centena);
		dezena = (num % 100) / 10;
		System.out.println("dezena: "+dezena);
		unidade = (num % 100) - (dezena * 10);
		System.out.println("unidade: "+unidade);
		}else
			System.out.println("O numero deveria ser menor que 1000!");
		entrada.close();
		
	}

}
