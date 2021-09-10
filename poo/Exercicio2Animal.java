/*Implemente um programa que crie os 3 tipos de animais definidos no exercício
anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
é, independente do tipo de animal.*/

package poo;

public abstract class  Exercicio2Animal{
	//atributos 
	
	private String idade;
	private String nome;
	abstract public void barulho(String som);//
	abstract public void acao(String mover);//abstratos
	
	//construtor
	
	public Exercicio2Animal (String nome,String idade)
	{
		this.idade = idade;
		this.nome = nome;
	}
	
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
