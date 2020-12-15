/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula Exceções
 */

package program;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		try{
			String[] vect = entrada.nextLine().split(" "); 
			int posicao = entrada.nextInt();
			System.out.println(vect[posicao]);	
		}
		catch (InputMismatchException e) {
			System.out.println("A posição que você selecionou não é válida");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Você selecionou um índice maior que o array");
		}
		entrada.close();
	}
}