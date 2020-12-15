/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula Estrutura condicional SWITCH-CASE
 */

package estCondcase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		//ENTRADA DE DADOS
		System.out.print("Digite um número inteiro qualquer: ");
		Scanner entrada = new Scanner(System.in);
		int x = entrada.nextInt();
		

		//ESTRUTURA CONDICIONAL		
		switch (x) {
		case 1:
			System.out.println("O número digitado foi 1");
			break;
		case 2:
			System.out.println("O número digitado foi 2");
			break;
		default:
			System.out.println("O número digitado não foi 1 nem 2");
		}
		
		entrada.close();
	}
}