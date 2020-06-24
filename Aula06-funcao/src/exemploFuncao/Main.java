/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula Função
 */

package exemploFuncao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número");
		int a=entrada.nextInt();
		System.out.println("Digite um número");
		int b=entrada.nextInt();
		System.out.println("Digite um número");		
		int c=entrada.nextInt();
		
		int d = maiorNumero(a, b, c);
		System.out.println(d);
		
		entrada.close();
	}
	
/**
 * Método para calcular o maior valor entre 3 números
 * 
 * @param a
 * @param b
 * @param c
 * @return MAX(a, b, c);
 */
	private static int maiorNumero(int a, int b, int c) {
		if (a>=b) {
			if(a>=c) {
				return a;
			}else {
				return c;
			}
		}else {
			if(b>=c) {
				return b;
			}else {
				return c;
			}
		}
	}
}