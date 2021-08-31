/*
 * 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.
 */





package exerciciospag1;

import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double cf,total;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nQual o Custo de frabrica: ");
		cf = leia.nextFloat();
		
		total=(cf + (cf * 0.28)+(cf * 0.45));
		
		
		System.out.println("\nTotal:"+total);
		
	}

}
