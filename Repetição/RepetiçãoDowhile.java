package Repetição;

import java.util.Scanner;

public class RepetiçãoDowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int valor,contPar=0,somaImpar=0,x=1;
		Scanner leia = new Scanner(System.in);
		
		do 
		 {
			System.out.println("\nEntre com um valor: ");
			valor = leia.nextInt();
		if(valor % 2 ==0)
		   {
			contPar++;
		    }
		else 
		    {
			somaImpar += valor;
		     }
		   x++;
		 }
		
		while(x<=4);	
			
		System.out.println("\n Numero de Pares: "+contPar+"  Soma de Impares: "+somaImpar);
	
	}

}
