/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula Estrutura de repetiçao FOR
 */

package estRepFor;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//ENTRADA DE DADOS
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos números você quer somar? ");
		int x = entrada.nextInt();
		
		int soma = 0; //DECLARO E INICIALIZO O ACUMLADOR
		
//ESTRUTURA DE REPETIÇÃO
		for (int i=0;i<x;i++) {
			System.out.println("Digite um número  ");
			int y = entrada.nextInt();
			soma = soma + y;
		}
		System.out.println(soma);
		entrada.close();
	}
}