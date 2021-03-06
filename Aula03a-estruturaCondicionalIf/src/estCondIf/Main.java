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
		Locale.setDefault(Locale.US);
		

		//ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o preço do produto: ");
		double preco = entrada.nextDouble();
		double desconto = 0.1; //desconto padrão
		

		//ESTRUTURA CONDICIONAL
		if (preco >= 300) {
			desconto=0.2; //desconto aplicado a compras cujo preço é maior que 299
			preco = preco - (desconto * preco);
			System.out.println("O preço depois do desconto é " + preco);
		}else {
			preco = preco - (desconto * preco);
			System.out.println("O preço depois do desconto é " + preco);
		}
		
		entrada.close();
	}
}