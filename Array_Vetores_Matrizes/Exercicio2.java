/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
*/

package Array_Vetores_Matrizes;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int num[] = new int [6];
			int numImpar,somaPar=0,qImpar=0;
			Scanner leia = new Scanner(System.in);
			
						
			for(int x=0;x<6;x++)
			{
				System.out.println("\nEntre com um Valor");
				num[x]= leia.nextInt();
				
				if(num[x] % 2 ==0)
				{
					somaPar += num[x];
					System.out.println("\nNumeros Pares: "+num[x]);
					
				}
				else 
				{
					qImpar ++;
					System.out.println("\nNumeros Impares: "+num[x]);
					
				}
				
			}
			
			

			System.out.println("\nSoma dos numeros pares:"+somaPar);
			System.out.println("\nQuantidade de impares: "+qImpar);
			
			
			
	}

}
