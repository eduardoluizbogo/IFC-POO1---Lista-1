package Lista1;

import java.util.Scanner;

public class Controle_exx30 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float qmorango=0;
		float qmaca=0;
		float preco1=0;
		float preco2=0;
		float kgjuntos=0;
		float precojuntos=0;
		float precofinal = 0;
		
		System.out.println("Insira a quantidade de morangos em Kg: ");
		qmorango = entrada.nextFloat();
		System.out.println("Insira a quantidade de macas em Kg: ");
		qmaca = entrada.nextFloat();
		
		if(qmorango <= 5) {
			preco1 = (float) (qmorango * 2.5);
		}else{
			preco1 = (float) (qmorango * 2.2);
		}
		
		if(qmaca <= 5) {
			preco2 = (float) (qmaca * 1.8);
		}else {
			preco2 = (float) (qmaca * 1.5);
		}
		
		kgjuntos = qmorango + qmaca;
		precofinal = preco1 + preco2;
		
		if(kgjuntos > 8 || precojuntos >25) {
			precofinal = (float) (precofinal * 0.90);
		}
		System.out.println("O valor final e: "+precofinal);
		
		entrada.close();
	}

}
