package Lista1;

import java.util.Scanner;

public class Controle_exx10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float n1,n2,n3,a = 0,b = 0;
		
		System.out.println("Digite um numero: ");
		n1 = entrada.nextFloat();
		
		System.out.println("Digite outro numero: ");
		n2 = entrada.nextFloat();
		
		System.out.println("Digite um ultimo numero: ");
		n3 = entrada.nextFloat();
		
		if(n1>n2 && n1>n3) {
			if(n2<n3) {
				n1 = a;
				n2 = b;
			}
		}
		if(n1>n2 && n1>n3) {
			if(n3<n2) {
				a = n1;
				b = n3;
			}
	}
		if(n2>n1 && n2>n3) {
			if(n1<n3) {
				a = n2;
				b = n1;
			}
		}
		if(n2>n1 && n2>n3) {
			if(n3<n1) {
				a = n2;
				b = n3;
			}
		}
		if(n3>n1 && n3>n2) {
			if(n2<n1) {
				a = n3;
				b = n2;
			}
		}
		if(n3>n1 && n3>n2) {
			if(n1<n2) {
				a = n3;
				b = n1;
			}
		}
		System.out.println("O maior e: "+a+" e o menor e: "+b);
		
		entrada.close();
		

}
}