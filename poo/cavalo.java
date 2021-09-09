package poo;

public class cavalo extends Animal {

	
	// Constructor

	public cavalo (String nome, int idade) {
		
		super(nome,idade);
	
		
	}

	public void printaCav()
	{
		System.out.println("\n o Cavalo: "+getNome()+" De "+getIdade()+" Anos Relinchou e Correu ");
		
	}
	
	
	
	
	
	
}
