package Lista1;

import java.util.Scanner;

public class Controle_exx14 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int dia=0;
		
		System.out.println("Digite 1-Segunda,2-Terca,3-Quarta,4-Quinta,5-Sexta,6-Sabado,7-Domingo: ");
		dia = entrada.nextInt();
		
		if(dia == 1){
			System.out.println("Segunda!");
		}else if(dia == 2) {
			System.out.println("Terca!");
		}else if(dia == 3) {
			System.out.println("Quarta!");
		}else if(dia == 4) {
			System.out.println("Quinta!");
		}else if(dia == 5) {
			System.out.println("Sexta!");
		}else if(dia == 6) {
			System.out.println("Sabado!");
		}else if(dia == 7) {
			System.out.println("Domingo!");
		}else {
			System.out.println("Voce digitou um numero invalido!");
		}
		entrada.close();
		
		

	}

}
