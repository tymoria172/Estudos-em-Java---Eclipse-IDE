/*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/

package ExerciciosCond;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valor,raiz,elev;
		Scanner leia = new Scanner(System.in);
		
	System.out.println("\n Qual Valor :");
	valor = leia.nextFloat();
	
	elev = Math.pow(valor, 2);
	raiz = Math.sqrt(valor);
		
	if(valor %2 ==0)
	{
		
		
		System.out.printf("\nO numero � PAR e sua Raiz � :"+raiz);
	}
	
	else 
	{
		
		System.out.printf("\nO numero � Impar e seu valor Elevado �:"+elev);
		
	}
		
	}

}
