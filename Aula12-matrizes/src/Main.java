/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula matrizes
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//CRIAÇÃO DA MATRIZ
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas linhas a matriz tem? ");
		int nLinhas = entrada.nextInt();
		System.out.println("Quantas colunas a matriz tem? ");
		int nColunas = entrada.nextInt();
		int[][] matriz = new int[nLinhas][nColunas];

//INICIALIZAÇÃO DA MATRIZ
		for (int i = 0; i < nLinhas; i++) {
			for (int j = 0; j < nColunas; j++) {
				System.out.println("Digite o elemento " + i + "," + j );	
				matriz[i][j] = entrada.nextInt();
			}
		}
		
//FAZ TESTE
		System.out.println("Digite um numero inteiro ");	
		int aux = entrada.nextInt();
		entrada.close();			
		int cont = 0;
		for (int i = 0; i < nLinhas; i++) {
			for (int j = 0; j < nColunas; j++) {
				if (matriz[i][j] < aux) {
					cont = cont + 1;
				}
			}
		}
		
		System.out.println("Na matriz, existem " + cont + " elemento(s) menor(es) que " + aux);
	
	}

}
