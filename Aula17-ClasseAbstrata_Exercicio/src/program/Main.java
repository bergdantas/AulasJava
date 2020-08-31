/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula Classe abstrata
 */
package program;

import data.Contribuinte;
import data.PessoaFisica;
import data.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		//cria o ojetos
		Contribuinte c1 = new PessoaFisica("Berg", 50000.00, 2000.00);
		Contribuinte c2 = new PessoaJuridica("LuxCorp", 400000.0, 25);
		
		//calcula o imposto
		c1.calculoImposto();
		c2.calculoImposto();
	}

}
