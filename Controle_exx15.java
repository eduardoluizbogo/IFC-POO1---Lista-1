package Lista1;

import java.util.Scanner;

public class Controle_exx15 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float preco=0;
		int cod=0;
		
		System.out.println("Insira o preco de custo: ");
		preco = entrada.nextFloat();
		
		System.out.println("Insira o codigo de origem: ");
		cod = entrada.nextInt();
		
		if(cod == 1 ) {
			System.out.println("O preco e: "+preco+" e a origem: sul");
		}else if(cod == 2) {
			System.out.println("O preco e: "+preco+" e a origem: norte");
		}else if(cod == 3) {
			System.out.println("O preco e: "+preco+" e a origem: leste");
		}else if(cod == 4) {
			System.out.println("O preco e: "+preco+" e a origem: oeste");
		}else if(cod == 5) {
			System.out.println("O preco e: "+preco+" e a origem: 5");
		}else if(cod == 6) {
			System.out.println("O preco e: "+preco+" e a origem: nordeste");
		}else if(cod == 7) {
			System.out.println("O preco e: "+preco+" e a origem: 7");
		}else if(cod == 8) {
			System.out.println("O preco e: "+preco+" e a origem: centro-oeste");
		}else {
			System.out.println("O preco e: "+preco+" e a origem: importado");
			
			entrada.close();
		}
	}

}
