/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/

package poo;

import java.text.NumberFormat;

public class ProdutoEletronico {

	// Atributos
	
        private String marca;
        private String tipo;
        private int preço;
        
      //Construtor  
        
       public ProdutoEletronico(String tipo,String marca,int preço)
       {
    	   this.marca = marca;
    	   this.preço = preço;
    	   this.tipo = tipo;
    	   
       }
	//Metodos
       
       public String formatoNota()
       {
    	   NumberFormat nf = NumberFormat.getCurrencyInstance();
    	   nf.setMinimumFractionDigits(2);
    	   String formatoNota = nf.format(preço);
    	   return formatoNota;
       }
       
       public void Print()
       {
    	   System.out.println("\nProduto: "+tipo+" da marca "+marca+" Valor de: "+this.formatoNota());
       }

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPreço() {
		return preço;
	}

	public void setPreço(int preço) {
		this.preço = preço;
	}
       
       
}
