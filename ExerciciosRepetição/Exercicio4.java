/*4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/


package ExerciciosRepetição;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade=0,sexo,perso,x=1,PC=0,MN=0,HA=0,OC=0,N4=0,C18=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(x!=5)
		{
			
			
			System.out.println("\nQual sua idade?");
			idade = leia.nextInt();
			
			System.out.println("\nQual seu genero? \n1-Masculino \n2-Feminino \n3-Outros?");
			sexo = leia.nextInt();
			
			System.out.println("\nQual sua personalidade? \n1-Calma \n2-Nervosa \n3-Agressiva");
			perso = leia.nextInt();
			
			if(idade <= 100 && perso ==1 )
			{
				PC++;
			}
			if(sexo ==2 && perso ==2 )
			{
				MN++;
				
			}
			if(sexo==1 && perso ==3)
			{
				HA++;
			}
			if(sexo==3 && perso ==1 )
			{
				OC++;
			}
			if(idade>=40 && perso ==2)
			{
				N4++;
			}
			if(idade<=18 && perso ==1)
			{
				C18++;
			}
			x++;	
		}
		
		System.out.println("\nNumero de Pessoas calmas: "+PC);
		
		System.out.println("\nNumero de Mulheres nervosas: "+MN);
		
		System.out.println("\nNumero de Homens agressivos: "+HA);
		
		System.out.println("\nNumero de Otros Calmos: "+OC);
		
		System.out.println("\nNumero de Pessoas Nervosas com mais de 40: "+N4);
		
		System.out.println("\nNumero de Pessoas calmas Com menos de 18 anos: "+C18);
		
     	}
	}


