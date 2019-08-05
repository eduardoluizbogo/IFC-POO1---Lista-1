package Lista1;

import java.util.Scanner;

public class Controle_exx27 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float n1=0;
		float n2=0;
		int op=0;
		float resultado=0;
		float aux1=0;
		float def=0;
		
		System.out.println("Digite um numero: ");
		n1 = entrada.nextFloat();
		System.out.println("Digite outro numero: ");
		n2 = entrada.nextFloat();
		
		System.out.println("Escolha uma operacao ");
		System.out.println("1 - Adicao ");
		System.out.println("2 - Subtracao ");
		System.out.println("3 - Multiplicacao ");
		System.out.println("4 - Divisao ");
		op = entrada.nextInt();
		
		if(op == 1) {
			resultado = n1 + n2;
			System.out.println("O resultado e: "+resultado);
		}else if(op == 2) {
			resultado = n1 - n2;
			System.out.println("O resultado e: "+resultado);
		}else if(op == 3) {
			resultado = n1 * n2;
			System.out.println("O resultado e: "+resultado);
		}else if(op == 4) {
			resultado = n1 / n2;
			System.out.println("O resultado e: "+resultado);
		}
		
		aux1 = resultado % 2;
		
		if(aux1 == 0) {
			System.out.println("Par");
		}else if(aux1 != 0){
			System.out.println("Impar");
		}
		if(resultado < 0) {
			System.out.println("Negativo");
		}else if(resultado > 0) {
			System.out.println("Positivo");
		}
		
		aux1 = (int) (resultado - 0);
		def = (float) (resultado - aux1);
		
		if(def == 0)
			System.out.println("O numero e inteiro");
		else if(def != 0)
			System.out.println("O numero e decimal");
		
		entrada.close();
	}

}
