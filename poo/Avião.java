/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

package poo;

public class Avi�o {

	// Definindo meus atributos de classe

	private String Modelo;
	private String Destino;
	private String Companhia;

	// Definir meu construtor

	public Avi�o(String comp, String model, String dest) {
		this.Companhia = comp;
		this.Destino = dest;
		this.Modelo = model;

	}

	// Outros metodos que usei
	public void PrintaAe() {

		System.out.println("\nCompanhia a�ria: " + Companhia + " Com Veiculo modelo:  " + Modelo + " Tem o Destino:  " + Destino);

	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getDestino() {
		return Destino;
	}

	public void setDestino(String destino) {
		Destino = destino;
	}

	public String getCompanhia() {
		return Companhia;
	}

	public void setCompanhia(String companhia) {
		Companhia = companhia;
	}

}
