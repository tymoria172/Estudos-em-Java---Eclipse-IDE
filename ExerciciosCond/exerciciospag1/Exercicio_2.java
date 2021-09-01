/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.
*/

package exerciciospag1;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dias,meses,anos;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQuantos anos Voce tem?: ");
		anos = leia.nextInt ();
		
		
		dias = anos * 365;
		meses = anos *12;
		
		System.out.println("\nDias: "+dias);
		System.out.println("\nMeses: "+meses);
		System.out.println("\nAnos: "+anos);
		
		
		
		
	}

}
