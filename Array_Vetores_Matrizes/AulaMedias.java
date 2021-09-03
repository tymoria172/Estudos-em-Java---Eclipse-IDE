package Array_Vetores_Matrizes;

import java.util.Scanner;

public class AulaMedias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float media[] = new float[4];
		float somaMedia=0,mediaGeral;
		
		Scanner leia = new Scanner(System.in);	
		
		for(int x=0;x<4;x++)
		{
			System.out.println("\nEntre com a Media: ");
			media[x] = leia.nextFloat();
			
			somaMedia += media[x];
		}
		
		mediaGeral = somaMedia /4;
		System.out.printf("\nMedial geral : 5%2.2f",mediaGeral);
	}

}
