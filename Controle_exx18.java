package Lista1;

import java.util.Scanner;

public class Controle_exx18 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float l1=0;
		float l2=0;
		float l3=0;
		
		System.out.print("Insira a medida de um lado do triangulo: ");
		l1 = entrada.nextFloat();
		System.out.print("Insira a medida de outro lado do triangulo: ");
		l2 = entrada.nextFloat();
		System.out.print("Insira a medida de outro lado do triangulo: ");
		l3 = entrada.nextFloat();
		
		if((l1 + l2) > l3 || (l2 + l3) > l1 || (l3 + l1) > l2)
			System.out.println("E um triangulo");
			if(l1 == l2 && l1 == l3 && l2 == l3)
				System.out.println("E um triangulo equilatero");
			else if(l1 == l2 && l1 != l3)
				System.out.println("E um triangulo isosceles");
			else if(l1 == l3 && l2 != l3)
				System.out.println("E um triangulo isosceles");
			else if(l2 == l3 && l1 != l2)
				System.out.println("E um triangulo isosceles");
			else if(l1 != l2 && l1 != l3 && l2 != l3)
				System.out.println("E um triangulo escaleno");
			
			entrada.close();
	}

}
