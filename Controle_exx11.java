package Lista1;

import java.util.Scanner;

public class Controle_exx11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		char turno=' ';
		
		System.out.println("Em qual turno voce estuda?"
				+ " Digite M-Matutino,V-Vespertino ou N-Noturno.");
		turno = entrada.nextLine().charAt(0);
		
		if(turno == 'm' || turno == 'M')
			System.out.println("Bom dia");
		if(turno == 'v' || turno == 'V')
			System.out.println("Boa tarde");
		else if(turno == 'n' || turno == 'N')
			System.out.println("Boa noite");
		
		entrada.close();
	}

}
