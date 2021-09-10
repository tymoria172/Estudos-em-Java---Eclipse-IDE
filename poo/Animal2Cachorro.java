package poo;

public class Animal2Cachorro extends Exercicio2Animal {

	public Animal2Cachorro() {

		super("dogao", "14");

	}

	@Override
	public void barulho(String latido) {
		System.out.println("AUAUAUAUAUAUAUUA.....");
	}

	@Override
	public void acao(String correu) {
		System.out.println("\nEsta Correndo....");
	}
}