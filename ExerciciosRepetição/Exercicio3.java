/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

package ExerciciosRepetição;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade=0, contJ = 0, contV = 0;
		Scanner leia = new Scanner(System.in);

		while (idade != 99) {
			
			System.out.println("\nQual sua Idade: ");
			idade = leia.nextInt();
			
			if (idade < 21) {
		
				contJ++;
			}
			if (idade > 50) {
				contV++;
			}

		}

		System.out.println("\nPessoa com menos de 21 anos: " + contJ);
		System.out.println("\nPessoa com mais de 50 anos: " + contV);

	}

}
