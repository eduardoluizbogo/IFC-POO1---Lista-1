package Lista1;

import java.util.Scanner;

public class Controle_ex3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		char letra = ' ';
		System.out.println("Selecione F para feminino e M para Masculino: ");
		letra = entrada.nextLine().charAt(0);
		
		if(letra == 'F' || letra == 'f' )
			System.out.println("Feminino");
		else if(letra == 'M' || letra == 'm')
			System.out.println("Masculino");
		
		
		entrada.close();


	}

}
