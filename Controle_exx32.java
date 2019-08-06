package Lista1;

import java.util.Scanner;

public class Controle_exx32 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		char[] inserido = new char[10];
		char[] gabarito = {'a','a','b','b','c','c','d','d','e','e'};
		int pontos=0;
		
		for(int i = 0; i < inserido.length; i++) {
			System.out.println("Insira a resposta da questao: "+i);
			inserido[i] = entrada.next().charAt(0);
		}
		for(int i = 0; i < gabarito.length; i++) {
			System.out.println("Questao"+i+"-"+inserido[i]+"-"+gabarito[i]);
		if(inserido[i] == gabarito[i])
			pontos++;
		}
		
		
		System.out.println("O numero de acertos foi: "+pontos);
		
		entrada.close();
		}

}
