/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto*/


package ExerciciosCond;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade;
		Scanner leia = new Scanner(System.in);
		
	System.out.println("\n Qual sua idade :");
	idade = leia.nextInt();
		
       if(idade >=10 && idade <= 14 )
       {
    	   System.out.println("\n Categoria: Infantil");
       }
       if(idade >=15 && idade <= 17 )
       {
    	   System.out.println("\n Categoria: Juvenil");
       }
       if(idade >=18)
       {
    	   System.out.println("\n Categoria: Adulto");
       }
	}

	
}
