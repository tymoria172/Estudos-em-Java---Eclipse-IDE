/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
*/

package Array_Vetores_Matrizes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op = 0;

		double m1[][] = new double[2][2];
		double m2[][] = new double[2][2];
		double sM[][] = new double[2][2];
		double subM[][] = new double[2][2];
		int linha = 0, coluna = 0, constante = 0;

		Scanner leia = new Scanner(System.in);

		for (linha = 0; linha < 2; linha++) {
			for (coluna = 0; coluna < 2; coluna++) {
				System.out.println("\nDefina um Valor para Matriz1 : ");
				m1[linha][coluna] = leia.nextFloat();
				System.out.println("\nDefina um Valor para Matriz2 : ");
				m2[linha][coluna] = leia.nextFloat();

			}
		}

		while (op != 5) {

			System.out.println("\n\t\tMenu de opção");

			System.out.println("\nEscolha " + "\n 1 - somar duas matrizes");

			System.out.println("\n 2 - Subtrair duas matrizes");

			System.out.println("\n 3 - Adicionar uma Constante as duas matrizes");

			System.out.println("\n 4 - Imprimir as matrizes");
			op = leia.nextInt();

			if (op == 1) {
				for (linha = 0; linha < 2; linha++) {
					for (coluna = 0; coluna < 2; coluna++) {

						sM[linha][coluna] = m1[linha][coluna] + m2[linha][coluna];

					}
				}

			}
			if (op == 2) {
				for (linha = 0; linha < 2; linha++) {
					for (coluna = 0; coluna < 2; coluna++) {

						subM[linha][coluna] = m1[linha][coluna] - m2[linha][coluna];

					}
				}

			}
			if (op == 3) {
				for (linha = 0; linha < 2; linha++) {
					for (coluna = 0; coluna < 2; coluna++) {
						System.out.println("\nDefina um Valor Constante para Matriz 1 e 2: ");
						constante = leia.nextInt();

						m1[linha][coluna] = m1[linha][coluna] + constante;
						m2[linha][coluna] = m2[linha][coluna] + constante;

					}
				}

			}
			if (op == 4) {
				for (linha = 0; linha < 2; linha++) {
					for (coluna = 0; coluna < 2; coluna++) {
						System.out.println("\nMatriz 1 : " + m1[linha][coluna]);
					}
				}

				for (linha = 0; linha < 2; linha++) {
					for (coluna = 0; coluna < 2; coluna++) {

						System.out.println("\nMatriz 2 : " + m2[linha][coluna]);

					}
				}
				for (linha = 0; linha < 2; linha++) {
					for (coluna = 0; coluna < 2; coluna++) {

						System.out.println("\nMatriz Soma : " + sM[linha][coluna]);

					}
				}
				for (linha = 0; linha < 2; linha++) {
					for (coluna = 0; coluna < 2; coluna++) {
						System.out.println("\nMatriz Subtração : " + subM[linha][coluna]);
					}
				}
			}

			System.out.println("\n\t\tMenu de opção");

			System.out.println("\nEscolha " + "\n 1 - somar duas matrizes");

			System.out.println("\n 2 - Subtrair duas matrizes");

			System.out.println("\n 3 - Adicionar uma Constante as duas matrizes");

			System.out.println("\n 4 - Imprimir as matrizes");
			op = leia.nextInt();
		}

	}

}
