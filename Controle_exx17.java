package Lista1;

import java.util.Scanner;

public class Controle_exx17 {

public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float n1 = 0,n2 = 0,media = 0;
		System.out.print("Escreva uma nota : ");
		n1 = entrada.nextFloat();
		
		System.out.print("Escreva outra nota: ");
		n2 = entrada.nextFloat();
		
		media = (n1+n2)/2;
		
		System.out.println("A primeira nota e: "+n1);
		System.out.println("A segunda nota e: "+n2);
		
		if(media <= 10 && media >= 9)
			System.out.println("Conceito A - APROVADO e a media e: "+media);
		else if(media < 9 && media >= 7.5)
			System.out.println("Conceito B - APROVADO e a media e: "+media);
		else if(media < 7.5 && media >= 6.5)
			System.out.println("Conceito C - APROVADO e a media e: "+media);
		else if(media < 6 && media >= 4)
			System.out.println("Conceito D - REPROVADO e a media e: "+media);
		else if(media < 4 && media >= 0)
			System.out.println("Conceito E - REPROVADO e a media e: "+media);
		else
			System.out.println("A nota e invalida");
			
	
		entrada.close();
		
	}

}
