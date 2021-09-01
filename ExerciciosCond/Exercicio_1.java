/*1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/

package ExerciciosCond;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2,num3;
		Scanner leia = new Scanner(System.in);
		
	System.out.println("\n Qual o primeiro valor :");
	num1 = leia.nextInt();
	
	System.out.println("\n Qual o segundo valor :");
	num2 = leia.nextInt();
	
	System.out.println("\n Qual o terceiro valor :");
	num3 = leia.nextInt();
	
			if (num1 > num2 && num1 > num3)
			{
				System.out.println("\nValor maior "+num1);
			}
			if (num2 > num1 && num2 > num3)
			{
				System.out.println("\nValor maior "+num2);
			}
			if (num3 > num2 && num3 > num1)
			{
				System.out.println("\nValor maior "+num3);
			}
				
		
		
	}

}
