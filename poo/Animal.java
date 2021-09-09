package poo;

public class Animal {

	// atributos
	private String nome;
	private int idade;
	

	// Constructor

	public Animal(String nome, int idade) {
		this.idade = idade;
		this.nome = nome;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	

	
}
