package ExerciciosCondicionais;

import java.util.Scanner;

public class Exercicio1Cond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			float nota1,nota2,nota3,media;
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Entre com a Primeira nota: ");
			nota1 = leia.nextFloat();
			
			System.out.println("Entre com a segunda nota: ");
			nota2 = leia.nextFloat();
			
			System.out.println("Entre com a terceira nota: ");
			nota3 = leia.nextFloat();
			
			media = (nota1 + nota2 + nota3) / 3;
			System.out.printf("\nSua media: %2.2f",media);
			
			if (media >=7 && media <=10 )
			{
				
				System.out.println("\nParabens vc foi aprovade");
				
			}
			else if (media>=5 && media<7)
			{
				System.out.println("\nVc ficou de exame");
				
			}
			
			else 
			{
				
				System.out.println("\nVc foi reprovade ");
				
			}
		
		
	}

}
