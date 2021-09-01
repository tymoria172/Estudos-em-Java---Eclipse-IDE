  
/*4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão:

*/
package exerciciospag1;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double A,B,C,d,r,s;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre Com valor e A: ");
		A = leia.nextFloat();
		
		System.out.println("\nEntre Com valor e B: ");
		B = leia.nextFloat();
		
		System.out.println("\nEntre Com valor e C: ");
		C = leia.nextFloat();
		
		r = Math.pow((A + B), 2);
		s = Math.pow((B + C), 2);
		d = (r +s) / 2;
		
		System.out.println("\nValor de R: "+r);
		System.out.println("\nValor de D: "+d);
		System.out.println("\nValor de S: "+s);
	}

}
