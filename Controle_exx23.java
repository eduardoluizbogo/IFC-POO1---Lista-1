package Lista1;

import java.util.Scanner;

public class Controle_exx23 {

	public static void main(String[] args) {


		Scanner entrada = new Scanner(System.in);
		
		float idade1 = 0,idade2 = 0,idade3=0,media = 0;
		
		System.out.print("Escreva a primeira idade: ");
		idade1 = entrada.nextFloat();
		
		System.out.print("Escreva a segunda idade: ");
		idade2 = entrada.nextFloat();
		
		System.out.print("Escreva a terceira idade: ");
		idade3 = entrada.nextFloat();
		
		media = (idade1+idade2+idade3)/3;
		if(idade1 <= 0 || idade1 > 120) 
			System.out.println("A primeira idade e invalida!");
		else if(idade2 <= 0 || idade2 > 120)
			System.out.println("A segunda idade e invalida!");
		else if(idade3 <= 0 || idade3 > 120)		
			System.out.println("A terceira idade e invalida!");
		else if(media >= 0 && media < 25)
			System.out.println("Turma jovem!");
		else if(media >= 25 && media < 40)
			System.out.println("Turma adulta!");
		else if(media >= 40 && media <=120)
			System.out.println("Turma idosa!");
	
		entrada.close();
		
	}

}
