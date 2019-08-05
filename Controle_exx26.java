package Lista1;

import java.util.Scanner;

public class Controle_exx26 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float num = 0;
		int aux = 0;
		float def=0;
		System.out.println("Insira um numero para saber se e inteiro ou decimal: ");
		num = entrada.nextFloat();
		
		aux = (int) (num - 0);
		def = (float) (num - aux);
		
		if(def == 0)
			System.out.println("O numero e inteiro");
		else if(def != 0)
			System.out.println("O numero e decimal");
		
		entrada.close();

	}

}
