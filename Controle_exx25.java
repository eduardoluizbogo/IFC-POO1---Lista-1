package Lista1;

import java.util.Scanner;

public class Controle_exx25 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int valor=0;
		int nota100=0;
		int nota50=0;
		int nota10=0;
		int nota5=0;
		int nota1=0;
		int aux=0;

		
		System.out.println("Digite o valor que desejas sacar: ");
		valor = entrada.nextInt();
		
		if(valor>= 10 && valor <=600) {
			nota100 = valor / 100;
			aux = valor % 100;
			nota50 = aux / 50;
			aux = aux % 50;
			nota10 = aux / 10;
			aux = aux % 10;
			nota5 = aux / 5;
			aux= aux % 5;
			nota1 = aux / 1;
			System.out.println(nota100+" notas de 100.");
			System.out.println(nota50+" notas de 50.");
			System.out.println(nota10+" notas de 10.");
			System.out.println(nota5+" notas de 5.");
			System.out.println(nota1+" notas de 1.");
			}else {
				System.out.println("O valor digitado foi invalido");
			}						 			
		entrada.close();
		}
	}
	

