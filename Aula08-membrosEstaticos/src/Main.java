/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula Membros estáticos
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//ENTRADA DE DADOS
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o valor do dólar hoje? ");
		double vDolar = entrada.nextDouble();
		System.out.println("Quantos dólares você quer comprar? ");		
		double vReais = entrada.nextDouble();

//INVOCA O MÉTODO ESTÁTICO - SEM CRIAR OBJETO - DA CLASSE CAMBIO		
		Cambio.calcularPreço(vDolar, vReais);
	
	entrada.close();
	}

}
