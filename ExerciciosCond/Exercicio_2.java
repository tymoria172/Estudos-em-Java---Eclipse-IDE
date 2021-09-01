/*2- Faça um programa que entre com três números e coloque em ordem crescente.
*/


package ExerciciosCond;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2,num3;
		Scanner leia = new Scanner(System.in);
		
	System.out.println("\n Qual o primeiro valor :");
	num1 = leia.nextInt();
	
	System.out.println("\n Qual o segundo valor :");
	num2 = leia.nextInt();
	
	System.out.println("\n Qual o terceiro valor :");
	num3 = leia.nextInt();
///////////////////////////////////////////N1///////////////////////////////////////////////		
	if (num1 > num2 && num1 > num3 && num2 > num3)
	{
		
		System.out.println("\nValores : "+num1+"\n"+num2+"\n"+num3);
	}
	if (num1 > num2 && num1 > num3 && num3 > num2)
	{
		
		System.out.println("\nValores : "+num1+"\n"+num3+"\n"+num2);
	}
///////////////////////////////////////N2///////////////////////////////////////////////////
	
	if (num2 > num1 && num2 > num3 && num1 > num3)
	{
		
		System.out.println("\nValores : "+num2+"\n"+num1+"\n"+num3);
	}
	if (num2 > num1 && num2 > num3 && num3 > num1)
	{
		
		System.out.println("\nValores : "+num2+"\n"+num3+"\n"+num1);
	}
////////////////////////////////////////////n3/////////////////////////////////////////////	
	if (num3 > num1 && num3 > num2 && num1 > num2)
	{
		
		System.out.println("\nValores : "+num3+"\n"+num1+"\n"+num2);
	}
	if (num3 > num1 && num3 > num2 && num2 > num1)
	{
		
		System.out.println("\nValores : "+num3+"\n"+num2+"\n"+num1);
	}	
	
	
	
	
	
	
	
	
	}

}
