package Lista1;

import java.util.Scanner;

public class Controle_exx19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float delta=0,a=0,b=0,c=0,eq1=0,eq2=0;
		
		System.out.print("Insira o valor de 'a': ");
		a = entrada.nextFloat();
		System.out.print("Insira o valor de 'b': ");
		b = entrada.nextFloat();
		System.out.print("Insira o valor de 'c': ");
		c = entrada.nextFloat();
		
		delta = (b * b) - (4 * a * c);
		System.out.println(delta);
		
		if(a == 0)
			System.out.println("A equacao nao e do segundo grau, sera encerrado");
		if(delta < 0)
			System.out.println("O delta e negativo, sera encerrado");
		if(delta == 0)
			System.out.println("A equação possui apenas uma raiz real");
		if(delta > 0)
			System.out.println("A equação possui duas raiz reais");
			
		eq1 = (-b + ((delta) * 1/2))  / 2;
		System.out.println("A equacao 1 vale: "+eq1);
		eq2 = (-b - ((delta) * 1/2))  / 2;
		System.out.println("A equacao 1 vale: "+eq2);
		
		entrada.close();
	}

}
