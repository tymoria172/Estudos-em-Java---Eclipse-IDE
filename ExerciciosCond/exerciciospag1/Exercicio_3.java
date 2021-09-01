/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
*/


package exerciciospag1;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int minutos,horas,segundos;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quanto segundos Durou o Evento?: ");
		segundos = leia.nextInt();
		
		minutos = segundos /60;
		horas = minutos / 60;
		
		System.out.println("\nO Evento durou um total de :\n"+horas+"h"+"\n"+minutos+"m"+"\n"+segundos+"s"+"\n");
		
		
		
		
		
	}

}
