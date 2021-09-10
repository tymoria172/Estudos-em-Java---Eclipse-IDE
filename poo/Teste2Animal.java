package poo;

public class Teste2Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal2Cachorro dog1 = new Animal2Cachorro();
		Animal2Cavalo cav1 = new Animal2Cavalo();
		Animal2Preg Preg1 = new Animal2Preg();
		Exercicio2Animal ani = null;
		
		
		
		System.out.println("O cachorro de nome: "+dog1.getNome()+" Tem "+dog1.getIdade()+" Anos ");
		dog1.acao("correu");
		dog1.barulho("latido");
		
		
		
		System.out.println("O cavalo de nome: "+cav1.getNome()+" Tem "+cav1.getIdade()+" Anos ");
		cav1.acao("correu");
		cav1.barulho("Relincho");
		
		
		
		System.out.println("A Preguiça de nome: "+Preg1.getNome()+" Tem "+Preg1.getIdade()+" Anos ");
		Preg1.acao("subindo");
		Preg1.barulho("Balido");
		
		
		
		
		
	}

}
