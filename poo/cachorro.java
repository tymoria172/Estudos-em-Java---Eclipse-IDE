package poo;

public class cachorro extends Animal {

	

		// Constructor

		public cachorro (String nome, int idade) {
			
			super(nome,idade);
		
			
		}

		public void printaDog()
		{
			System.out.println("\n o Cachorro: "+getNome()+" De "+getIdade()+" Anos latiu e Correu ");
			
		}
		
		
		
		
}
