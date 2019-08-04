package Lista1;

import java.util.Scanner;

public class Controle_exx16 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float n1 = 0,n2 = 0,media = 0;
		System.out.print("Escreva uma nota : ");
		n1 = entrada.nextFloat();
		
		System.out.print("Escreva outra nota: ");
		n2 = entrada.nextFloat();
		
		media = (n1+n2)/2;
		
		if(media >= 0 && media < 3)
			System.out.println("REPROVADO!");
		else if(media >= 3 && media <= 6.9)
			System.out.println("EM EXAME!");
		else if(media >= 7 && media <=10)
			System.out.println("APROVADO!");
		else
			System.out.println("Nota invalida");
			

		entrada.close();
		
	}

}
