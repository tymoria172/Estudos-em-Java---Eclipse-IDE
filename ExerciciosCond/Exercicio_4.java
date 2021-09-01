/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

package ExerciciosCond;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valor,raiz,elev;
		Scanner leia = new Scanner(System.in);
		
	System.out.println("\n Qual Valor :");
	valor = leia.nextFloat();
	
	elev = Math.pow(valor, 2);
	raiz = Math.sqrt(valor);
		
	if(valor %2 ==0)
	{
		
		
		System.out.printf("\nO numero é PAR e sua Raiz é :"+raiz);
	}
	
	else 
	{
		
		System.out.printf("\nO numero é Impar e seu valor Elevado é:"+elev);
		
	}
		
	}

}
