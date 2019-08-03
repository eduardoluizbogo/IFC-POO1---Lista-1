package Lista1;

import java.util.Scanner;

public class Controle_exx12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float salario=0,ajuste=0,aumento=0;
		
		System.out.println("Digite o seu salario: ");
		salario = entrada.nextFloat();
		
		if(salario >=0 && salario <=280)
			ajuste = (float) (salario * 1.20f);
		if(salario>280 && salario<700)
			ajuste = (float) (salario * 1.15f);
		else if(salario > 1500)
			ajuste = (float) (salario * 1.05f);
		else
			System.out.println("Voce digitou um numero invalido!");
		
		aumento = (float) (ajuste * 100)/(salario)-100;
		
		System.out.println("O salario antes do reajuste era: "+ salario);
		System.out.println("O percentual de aumento aplicado e: "+aumento);
		System.out.println("O valor do aumento e: "+(ajuste - salario));
		System.out.println("O novo salario apos o aumento e: "+ajuste);
		
		entrada.close();
		
		

	}

}
