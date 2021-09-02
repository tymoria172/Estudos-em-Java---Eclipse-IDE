/*6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

package ExerciciosRepetição;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
         int num=0,m=0,media=0,somamedia=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		do
		{
			m = num;
			System.out.println("Digite um Numero do teclado numerico: ");
			num = leia.nextInt();
			
			if(num % 3 ==0 )
			{
				m++;
				somamedia+=num;
					
			}
			
			media = somamedia / m;
		}
		
	
		while(num!=0);
	
		System.out.println("\n A media dos numeros: "+media);
	}
}
	

