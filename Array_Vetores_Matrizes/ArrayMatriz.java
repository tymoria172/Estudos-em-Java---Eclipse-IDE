package Array_Vetores_Matrizes;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int linha=2,coluna=3;
		int numero[][] = new int [linha][coluna];
		int contMais10=0,contMenos10=0;
	
		Scanner leia = new Scanner(System.in);
		
		for(int l=0;l<linha;l++)
		{
			for(int c=0;c<coluna;c++)
			{
				System.out.println("\nLeia um numero: ");
				numero[l][c] = leia.nextInt();
					
			}
		}
		for(int l=0;l<linha;l++)
		{
			for(int c=0;c<coluna;c++)
			{
				if(numero[l][c] > 10)
				{
					contMais10++;
					System.out.println("\n"+numero[l][c]+" <-----Maior que DEZ");
				}
				
				else if(numero[l][c] < 10)
				{
					contMenos10++;
					System.out.println("\n"+numero[l][c]+" <-----Menor que DEZ");
					
				}
				else {
					System.out.println("\n"+numero[l][c]+ "  ZERO  ");
				}
				
				
					
			}
		}
		System.out.println("\n Quantidade de Numeros maiores que 10:  "+contMais10);
		System.out.println("\n Quantidade de Numeros menores que 10:  "+contMenos10);
	
	
	}

}
