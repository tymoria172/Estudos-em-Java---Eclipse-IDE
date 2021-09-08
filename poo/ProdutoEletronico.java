/*3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console.*/

package poo;

import java.text.NumberFormat;

public class ProdutoEletronico {

	// Atributos
	
        private String marca;
        private String tipo;
        private int pre�o;
        
      //Construtor  
        
       public ProdutoEletronico(String tipo,String marca,int pre�o)
       {
    	   this.marca = marca;
    	   this.pre�o = pre�o;
    	   this.tipo = tipo;
    	   
       }
	//Metodos
       
       public String formatoNota()
       {
    	   NumberFormat nf = NumberFormat.getCurrencyInstance();
    	   nf.setMinimumFractionDigits(2);
    	   String formatoNota = nf.format(pre�o);
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

	public int getPre�o() {
		return pre�o;
	}

	public void setPre�o(int pre�o) {
		this.pre�o = pre�o;
	}
       
       
}
