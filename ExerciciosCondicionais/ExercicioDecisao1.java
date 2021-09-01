package ExerciciosCondicionais;

import java.util.Scanner;

public class ExercicioDecisao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\t\tMenu de Elogios");
		System.out.println("\n1- Vc é muito Linde...");
		System.out.println("\n2- Vc é Inteligente...");
		System.out.println("\n3- Vc é Perfeita...");
		System.out.println("\n4- Vc é Corajoso...");
		
		System.out.println("\n\t\tDigite sua opção de Elogio :");
		op = leia.nextInt();
		
		switch(op)
		{
		
		case 1:
			System.out.println("\n\t\tVc é Linda...");
			break;
		case 2:
			System.out.println("\n\t\tVc é inteligente...");
		break;
		case 3:
			System.out.println("\n\t\tVc é perfeita...");
		break;
		case 4:
			System.out.println("\n\t\tVc é Corajoso...");
		break;
		default:
			System.out.println("\n\t\tOpção Invalida.....");
		}	
	}

}
