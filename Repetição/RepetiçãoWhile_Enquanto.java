package Repetição;

import java.util.Scanner;

public class RepetiçãoWhile_Enquanto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float num,somanum=0, medianum;
		int contNum=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um Valor :");
		num = leia.nextFloat();
		
		
		while(num!=0)
		{
			
		contNum++;
		somanum += num;
		System.out.println("\n Entre com um Numero");
		num = leia.nextFloat();
			
		}
		
		medianum = somanum / contNum;
		System.out.printf("\n Media dos Numeros %.2f :",medianum);
		
		
	}

}
