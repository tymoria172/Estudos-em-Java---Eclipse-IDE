package exerciciospag1;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d,x1,x2,y1,y2;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com Valor de X1 :");
		x1 = leia.nextFloat();
				
		System.out.println("\nEntre com Valor de x2 :");
		x2 = leia.nextFloat();
		
		System.out.println("\nEntre com Valor de y1 :");
		y1 = leia.nextFloat();
		
		System.out.println("\nEntre com Valor de y2 :");
		y2 = leia.nextFloat();
	
		d = Math.sqrt(Math.pow((x2-x1), 2)) + Math.pow((y2 - y1),2);
		
		System.out.println("\n A distancia foi de:"+d);
		
	}

}
