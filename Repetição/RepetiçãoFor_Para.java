package Repetição;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		float n1,n2,n3,somaMedia=0,media,mg=0;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1; x <= 4; x++)
		{
			
		System.out.println("\n Entre com a Primeira media :");
		n1 = leia.nextFloat();
		
		System.out.println("\n Entre com a Segunda media :");
		n2 = leia.nextFloat();
		
		System.out.println("\n Entre com a Terceira media :");
		n3 = leia.nextFloat();
			
		media = (n1+n2+n3) /3;
		
		System.out.printf("\nMédia alune %d: %2.2f: ",x,media);
		
		somaMedia += media;
		}
		
		mg = somaMedia / 4;
		System.out.println("\nMédia Geral :"+mg);
		
			
	}

}
