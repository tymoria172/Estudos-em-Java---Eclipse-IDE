package ExerciciosCondicionais;

import java.util.Scanner;

public class ExercicioDecisao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\t\tMenu de Elogios");
		System.out.println("\n1- Vc � muito Linde...");
		System.out.println("\n2- Vc � Inteligente...");
		System.out.println("\n3- Vc � Perfeita...");
		System.out.println("\n4- Vc � Corajoso...");
		
		System.out.println("\n\t\tDigite sua op��o de Elogio :");
		op = leia.nextInt();
		
		switch(op)
		{
		
		case 1:
			System.out.println("\n\t\tVc � Linda...");
			break;
		case 2:
			System.out.println("\n\t\tVc � inteligente...");
		break;
		case 3:
			System.out.println("\n\t\tVc � perfeita...");
		break;
		case 4:
			System.out.println("\n\t\tVc � Corajoso...");
		break;
		default:
			System.out.println("\n\t\tOp��o Invalida.....");
		}	
	}

}
