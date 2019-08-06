package Lista1;

import java.util.Scanner;

public class Controle_ex7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float n1 = 0,n2 = 0,n3 = 0;
		
		System.out.println("Insira um numero: ");
		n1 = entrada.nextFloat();
		System.out.println("Insira outro numero: ");
		n2 = entrada.nextFloat();
		System.out.println("Insira outro numero: ");
		n3 = entrada.nextFloat();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println(n1);
			if(n2 > n3) {
				System.out.println(n2 +"\n"+ n3);
			}else {
				System.out.println(n3 +"\n"+ n2);
			}
		}else if(2 > 1 && n2 > n3) {
			System.out.println(n2);
			if(n1 > n3) {
				System.out.println(n1 +"\n"+ n3);
			}else {
				System.out.println(n3 +"\n"+ n1);
			}
		}else {
			System.out.println(n3);
			if(n1 > n2) {
				System.out.println(n1 +"\n"+ n2);
			}else {
				System.out.println(n2 +"\n"+ n1);
			}
		}
		entrada.close();
	}
}
