/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula Estrutura de repetiçao WHILE
 */

package estRepWhile;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite um número: ");
		int x = entrada.nextInt();
		int acum = x;
		
//ESTRUTURA DE REPETIÇÃO
		while(x!=0) {
			System.out.print("digite um número: ");
			x = entrada.nextInt();
			acum = acum + x;
		}
		
		entrada.close();
		System.out.println(acum);
	}
}
