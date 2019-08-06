package Lista1;

import java.util.Scanner;

public class Controle_exx13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float ganhahora=0;
		float hmes=0;
		float salario=0;
		float IR=0;
		float INSS=0;
		float FGTS=0;
		float descontos=0;
		
		System.out.println("Quanto voce ganha por hora? ");
		ganhahora = entrada.nextFloat();
		System.out.println("Qauntas horas voce trabalha no mes? ");
		hmes = entrada.nextFloat();
		
		salario = ganhahora * hmes;
		
		if(salario <= 900)
			IR = (float) (salario * 0);
		else if(salario > 900 && salario <= 1500)
			IR = (float) (salario * 0.05);
		else if(salario > 1500 && salario <= 2500)
			IR = (float) (salario * 0.1);
		else if(salario > 2500)
			IR = (float) (salario * 0.2);
		else if(salario < 0)
			System.out.println("Salario invalido");
		
		
		INSS = (float) (salario * 0.1);
		FGTS = (float) (salario * 0.15);
		descontos = IR + INSS + FGTS;
		
		System.out.println("(-) IR: "+IR);
		System.out.println("(-) INSS: "+INSS);
		System.out.println("(-) FGTS: "+FGTS);	
		System.out.println("Total de descontos: "+descontos);
		System.out.println("Salario liquido: "+(salario - descontos));
		
		entrada.close();

	}

}
