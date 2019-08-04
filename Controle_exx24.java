package Lista1;

import java.util.Scanner;

public class Controle_exx24 {

	public static void main(String[] args) {

		
Scanner entrada = new Scanner(System.in);
		
		float n1 = 0,n2 = 0,n3=0,media = 0;
		System.out.print("Escreva uma nota : ");
		n1 = entrada.nextFloat();
		
		System.out.print("Escreva outra nota: ");
		n2 = entrada.nextFloat();
		
		System.out.print("Escreva outra nota: ");
		n3 = entrada.nextFloat();
		
		media = (n1+n2+n3)/3;
		
		if(media >= 0 && media < 7) {
			System.out.println("REPROVADO!");
			System.out.println("A media foi: "+media);
		}else if(media >= 7 && media < 10) {
			System.out.println("APROVADO!");
			System.out.println("A media foi: "+media);
		}else if(media == 10) {
			System.out.println("APROVADO COM DISTINCAO!");
		}else {
			System.out.println("Nota invalida");
		}

		entrada.close();

	}

}
