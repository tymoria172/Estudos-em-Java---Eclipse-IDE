/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente. */



package exerciciospag1;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float nota1,nota2,nota3,media,a,b,c,v1,v2,v3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a Nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.println("\nEntre com a Nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.println("\nEntre com a Nota 3: ");
		nota3 = leia.nextFloat();
		
		a = nota1 *2;
		v1 = a /10;
		
		b = nota2 *3;
		v2 = b /10;
		
		c = nota3 *5;
		v3 = c /10;
		
		media = ( v1 + v2 + v3) / 3;
		
		System.out.printf("\nMedia %.2f",media);
	}

}
