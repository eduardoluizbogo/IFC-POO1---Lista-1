package Lista1;

import java.util.Scanner;

public class Controle_exx21 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int dia = 0;
		int mes = 0;
		int ano = 0;
		
		System.out.println("Insira uma data no formato dd/mm/aaaa ");
		System.out.println("Insira o dia: ");
		dia = entrada.nextInt();
		System.out.println("Insira o mes: ");
		mes = entrada.nextInt();
		System.out.println("Insira o ano: ");
		ano = entrada.nextInt();
		
		if(dia <= 0 || dia > 31)
			System.out.println("A data nao e valida!");
		else if(mes <= 0 || mes > 12)
			System.out.println("A data nao e valida!");
		else if(ano <= 0 || ano > 9999)
			System.out.println("A data nao e valida!");
		else
			System.out.println("A data e valida! "+dia+"/"+mes+"/"+ano);
		
		entrada.close();
	}

}
