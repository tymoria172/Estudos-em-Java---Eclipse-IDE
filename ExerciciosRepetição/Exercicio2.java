/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

package ExerciciosRepetição;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,contImpar=0,contPar=0,x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<5;x++)
		{
			System.out.println("\nEntre com um Valor :");
			num = leia.nextInt();
			
			if(num %2 ==0)
			{
				contPar++;	
			}
			
			else
			{
				contImpar++;
			}
					
		}
		
		System.out.println("\nQuantidade de Pares: "+contPar);
		System.out.println("\nQuantidade de Impares: "+contImpar);
		
	}

}
