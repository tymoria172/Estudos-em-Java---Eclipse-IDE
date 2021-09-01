/* 
 *  1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.
 */


package exerciciospag1;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int dias,meses=0,anos=0;
			Scanner leia = new Scanner(System.in);
			
			System.out.println("\nQuantos anos vc tem?: ");
				anos = leia.nextInt();
			
			dias = anos * 365;
			meses = anos * 12;
			
			System.out.println("\nDias :"+dias);

	}

}
