/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package poo;

public class Avião {

	// Definindo meus atributos de classe

	private String Modelo;
	private String Destino;
	private String Companhia;

	// Definir meu construtor

	public Avião(String comp, String model, String dest) {
		this.Companhia = comp;
		this.Destino = dest;
		this.Modelo = model;

	}

	// Outros metodos que usei
	public void PrintaAe() {

		System.out.println("\nCompanhia aéria: " + Companhia + " Com Veiculo modelo:  " + Modelo + " Tem o Destino:  " + Destino);

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
