package Lista1;

import java.util.Scanner;

public class Controle_ex9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float altura,peso,ideal;
		String sexo;
		
		System.out.println("Digite sua altura: ");
		altura = entrada.nextFloat();
				
		System.out.println("Digite seu peso: ");
		peso = entrada.nextFloat();
			
		entrada.nextLine();
		
		System.out.println("Digite seu sexo: ");
		sexo = entrada.nextLine();
		
		System.out.println("Altura: "+altura);
		System.out.println("Peso: "+peso);
		System.out.println("Sexo: "+sexo);
		
		ideal = (float) (72.7 * altura - 58);
		
		if(peso>ideal)
			System.out.println("Acima do peso");
		else if(peso<ideal)
			System.out.println("Abaixo do peso");
		else
			System.out.println("No peso");
		
		entrada.close();
	
	}

}
