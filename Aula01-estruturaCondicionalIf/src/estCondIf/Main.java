/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula Estrutura condicional IF
 */

package estCondIf;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); //NUMÉROS DOUBLE SEPARADOS POR . (O DEFAULT É ,)
		
//ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o preço do produto: ");
		double preco = entrada.nextDouble();

		double desconto = 0.1; //DESCONTO PADRÃO
		
//ESTRUTURA CONDICIONAL
		if (preco >= 300) {
			desconto=0.2; //DESCONTO APLICADO A COMPRAS DE PREÇO MAIOR QUE 299
			preco = preco - (desconto * preco);
			System.out.println("O preço depois do desconto é " + preco);
		}else {
			preco = preco - (desconto * preco);
			System.out.println("O preço depois do desconto é " + preco);
		}
		
		entrada.close();
	}
}