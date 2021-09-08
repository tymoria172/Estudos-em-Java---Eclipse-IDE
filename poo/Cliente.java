/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package poo;

public class Cliente {
	
	//	DEFININDO MEUS ATRIBUTOS DA CLASSE 
	
	private String Nome;
	private int Idade;
	private String Endereço;
	
	//DEFININDO MEU CONSTRUTOR
	
		public Cliente (String n,int idade,String end)
		{
			this.Endereço = end;
			this.Idade = idade;
			this.Nome = n;
		}
		
		// MAIS METODOS 
		
	/*	public void imprimirInfo()
		{
			
			System.out.println("\n"+"Cliente "+Nome+" Tem a idade de: "+Idade+" e mora em: "+Endereço);
			
		}*/

		public String getNome() {
			return Nome;
		}

		public void setNome(String nome) {
			Nome = nome;
		}

		public int getIdade() {
			return Idade;
		}

		public void setIdade(int idade) {
			Idade = idade;
		}

		public String getEndereço() {
			return Endereço;
		}

		public void setEndereço(String endereço) {
			Endereço = endereço;
		}

		
		
}
