/*1) Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

package poo;

public class Cliente {
	
	//	DEFININDO MEUS ATRIBUTOS DA CLASSE 
	
	private String Nome;
	private int Idade;
	private String Endere�o;
	
	//DEFININDO MEU CONSTRUTOR
	
		public Cliente (String n,int idade,String end)
		{
			this.Endere�o = end;
			this.Idade = idade;
			this.Nome = n;
		}
		
		// MAIS METODOS 
		
	/*	public void imprimirInfo()
		{
			
			System.out.println("\n"+"Cliente "+Nome+" Tem a idade de: "+Idade+" e mora em: "+Endere�o);
			
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

		public String getEndere�o() {
			return Endere�o;
		}

		public void setEndere�o(String endere�o) {
			Endere�o = endere�o;
		}

		
		
}
