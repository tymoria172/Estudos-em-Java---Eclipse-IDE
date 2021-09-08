package poo;

public class TesteAvião {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		Avião plane1 = new Avião("LATAM","Boing 737","Roma - Italia ");

		plane1.PrintaAe();
		
		System.out.println("\nAERONAVE DESAPERECIDA NA REGIAO DO GOLFO PERSICO");
		
		plane1.setCompanhia("QATAR AIRWAYS");
		plane1.setModelo("Airbus A380");
		plane1.setDestino("Golfo Persico");
		
		System.out.println("\nNova Aeronave Esta a caminho ");
		
		plane1.PrintaAe();
		
		
	}

}
