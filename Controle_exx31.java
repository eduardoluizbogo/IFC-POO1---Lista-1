package Lista1;

import java.util.Scanner;

public class Controle_exx31 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int selecionar=0;
		float peso=0;
		float preco=0;
		int formapag=0;
		float precototal=0;
		String type=" ";
		
		
		System.out.println("Selecione 1-File duplo 2-Alcatra e 3-Picanha");
		selecionar = entrada.nextInt();
		
		switch(selecionar) {
		case 1:
			System.out.println("Digite a quantidade em kg: ");
			peso = entrada.nextFloat();
			
			if(peso <= 5) {
				preco = (float) (peso * 4.90);
				type = "File duplo";
			}else if(peso > 5) {
				preco = (float) (peso * 5.80);
				type = "File duplo";
			}
			break;
		case 2:
			System.out.println("Digite a quantidade em kg: ");
			peso = entrada.nextFloat();
			
			if(peso <= 5) {
				preco = (float) (peso * 5.90);
				type = "Alcatra";
			}else if(peso > 5) {
				preco = (float) (peso * 6.80);	
				type = "Alcatra";
			}
			break;
		case 3:
			System.out.println("Digite a quantidade em kg: ");
			peso = entrada.nextFloat();
			
			if(peso <= 5) {
				preco = (float) (peso * 6.90);
				type = "Picanha";
			}else if(peso > 5) {
				preco = (float) (peso * 7.80);
				type = "Picanha";
			}
			break;
		}
			
		
			System.out.println("1-Cartao Tabajara ou 2-pagamento normal?");
			formapag = entrada.nextInt();
			
			switch(formapag) {
			case 1:
				precototal = (float) (preco * 0.95);
				System.out.println("O tipo de pagamento foi: Caratao Tabajara");
				break;
			case 2 :	
				precototal = preco;
				System.out.println("O tipo de pagamento foi: Pagamento normal");
				break;
			}
			System.out.println("A quantidade comprada foi: "+peso);
			
			System.out.println("O desconto foi de: "+(preco - precototal));
			
			System.out.println("O preco final e: "+precototal);
			
			System.out.println("O tipo da carne e: "+type);
						
			entrada.close();
	}

}
