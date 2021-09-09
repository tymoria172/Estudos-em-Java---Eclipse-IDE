package poo;

public class Preguiça extends Animal{
	
	// Constructor

	public Preguiça (String nome, int idade) {
		
		super(nome,idade);
	
		
	}

	public void printaPreg()
	{
		System.out.println("\n A preguiça: "+getNome()+" De "+getIdade()+" anos Balidou e subiu na arvore  ");
		
	}
	
	

}
