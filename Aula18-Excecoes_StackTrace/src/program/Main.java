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
		metodo1();
	}

	public static void metodo1() {
		System.out.println("M1-Início");
		metodo2();
		System.out.println("M1-Fim");
	}

	public static void metodo2() {
		System.out.println("M2-Início");

		Scanner entrada = new Scanner(System.in);

		try {
			String[] vect = entrada.nextLine().split(" ");
			int posicao = entrada.nextInt();
			System.out.println(vect[posicao]);
		} catch (InputMismatchException e) {
			System.out.println("A posição que você selecionou não é válida");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Você selecionou um índice que não existe no array");
			e.printStackTrace();
		} finally {
			System.out.println("O que estiver neste bloco será executado!");
		}
		System.out.println("Fim do programa!!!");
		entrada.close();
		System.out.println("M2-Fim");

	}
}