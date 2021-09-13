package ExerciciosColletions;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int op;
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList <String> estoque = new ArrayList();
		
		do {
			System.out.println("\n\t\tLista de opções");
			System.out.println("\n(1) Deseja adicionar produtos ao estoque?? ");
			System.out.println("\n(2) Deseja remover produtos do estoque?? ");
			System.out.println("\n(3) Deseja atualizar produtos do estoque?? ");
			System.out.println("\n(4) Mostrar produtos do estoque?? ");
			System.out.println("\n(0) Deseja encerrar o programa?? ");
			
			System.out.println("\nQual sua opção??");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:// adicionando produto
				leia.nextLine();//limpando o cache de memoria
				System.out.println("\nDigite o produto para a adicionar ao estoque: ");
				String produto = leia.nextLine();//Criando variavel produto para adicionar a minha lista ESTOQUE
				estoque.add(produto);
				System.out.println(estoque);
				break;
			case 2://removendo produto
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produtor = leia.nextLine();
				if(estoque.contains(produtor))//Revisando meu estoque pra ver se existe o produto digitado
				{
					estoque.remove(produtor);// remove o produto digitado
				}
				else // caso n exista 
				{
					System.out.println("\nProduto nao Existe !!!!!!!!");
				}
				System.out.println(estoque);
				break;
			case 3:// atualizando produto
				leia.nextLine();
				System.out.println("\nDigite o produto que quer atualizar: ");
				String verifica = leia.nextLine();// verificando se o produto existe
				System.out.println("\nDigite o nome do produto que entrara no lugar do produto: "+verifica+"");
				String novo = leia.nextLine();// criando novo produto
				
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);//Removi o produto que ele deseja atualizar
					estoque.add(novo);// adicionei novo produto 
				}
				else
				{
					System.out.println("\nProduto nao existe !!!!!");		
				}
				System.out.println(estoque);
				break;
			case 4:
				System.out.println("\nOs produtos do estoque são: ");
				System.out.println(estoque);
				break;
				default: 
					System.out.println("\nOpção invalida!!!!");
			}
			
			
			
			
		}while(op!=0);
		
		
		
	}



	}


