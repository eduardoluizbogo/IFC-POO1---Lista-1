package Lista1;

import java.util.Scanner;

public class Controle_exx28 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String t1=" ";
		String t2=" ";
		String t3=" ";
		String t4=" ";
		String t5=" ";
		int respostassim=0;
		
		System.out.println("Telefonou para a vitima?");
		t1 = entrada.nextLine();
		System.out.println("Esteve no local do crime?");
		t2 = entrada.nextLine();
		System.out.println("Mora perto da vítima?");
		t3 = entrada.nextLine();
		System.out.println("Devia para a vítima?");
		t4 = entrada.nextLine();
		System.out.println("Já trabalhou com a vítima?");
		t5 = entrada.nextLine();
		
		 if(t1.toLowerCase().equals("sim")){
             respostassim++;
		 }if(t2.toLowerCase().equals("sim")){
        	 respostassim++;
		 }if(t3.toLowerCase().equals("sim")){
             respostassim++;
		 }if(t4.toLowerCase().equals("sim")){
             respostassim++;
		 }if(t5.toLowerCase().equals("sim")){
             respostassim++;
		 }
             
             if(respostassim == 2)
            	 System.out.println("Suspeita");
             else if(respostassim == 3 || respostassim == 4)
            	 System.out.println("Cumplice");
             else if(respostassim == 5)
            	 System.out.println("Assassino");
             else if(respostassim == 0 || respostassim == 1)
            	 System.out.println("Inocente");
             
             entrada.close();
	}
}

      