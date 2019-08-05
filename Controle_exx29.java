package Lista1;

import java.util.Scanner;

public class Controle_exx29 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float litros;
		float valor = 0;
		char comb = ' ';
		
		System.out.println("Quantos litros deseja colocar?");
		litros = entrada.nextFloat();
		
		System.out.println("Selecione A-Alcool e G-Gasolina");
		comb = entrada.next().charAt(0);
		
		if(litros <= 20 && comb == 'A')
			valor = (float) (litros * 1.90 * 0.97);
		else if(litros > 20 && comb == 'A')
			valor = (float) (litros * 1.90 * 0.95);
		else if(litros <= 20 && comb == 'G')
			valor = (float) (litros * 2.50 * 0.96);
		else if(litros > 20 && comb == 'G')
			valor = (float) (litros * 2.50 * 0.94);

		
		System.out.println(valor);
		
		entrada.close();
	}

}
