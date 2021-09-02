/*5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/

package ExerciciosRepetição;

import java.util.Scanner;

public class Exercicios5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=0,soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		do
		{
			soma+= num;
			System.out.println("Digite um Numero do teclado numerico: ");
			num = leia.nextInt();
		}
		
	
		while(num!=0 && num<=9);
	
		System.out.println("\n A soma dos numeros: "+soma);
	}
}
	


