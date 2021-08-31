package exerciciospag1;

import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float A,B,C,D,E,F,X,Y;
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Entre com Valor de A:");
		A = leia.nextFloat();
		
		System.out.println("Entre com Valor de B:");
		B = leia.nextFloat();
		
		System.out.println("Entre com Valor de C:");
		C = leia.nextFloat();
		
		System.out.println("Entre com Valor de D:");
		D = leia.nextFloat();
		
		System.out.println("Entre com Valor de E:");
		E = leia.nextFloat();
		
		System.out.println("Entre com Valor de F:");
		F = leia.nextFloat();
		
		X = (C*E - B*F) / (A*E - B*D);
		Y = (A*F - C*D) / (A*E - B*D);
		
		System.out.printf("\nValor de X:%2.2f",X);
		System.out.printf("\nValor de y:%2.2f",Y);
	
	}

}
