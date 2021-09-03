/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
*/


package Array_Vetores_Matrizes;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int linha=3,coluna=3;
		int num[][] = new int[linha][coluna];
		int cont10=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int l=0;l<linha;l++)
		{
			for(int c=0;c<coluna;c++)
			{
				
			System.out.println("\nEntre com uma valor : ");
			num[l][c] = leia.nextInt();
			
				if(num[l][c] > 10)
				{
					cont10++;
				
				}
			
			}	
		}
		
		System.out.println("\nQuantidade de numeros maiores que 10: "+cont10);
		
	}
}
