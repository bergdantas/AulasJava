/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula POO (Resolvendo problemas com orientação a objetos)
 * Construtores, encapsulamento, getters e setters
 */

package control;

import java.util.Locale;
import java.util.Scanner;
import model.ContaCorrente;

public class Main {

	public static void main(String[] args) {
//ENTRADA DE DADOS
		Locale.setDefault(Locale.US); //se quiser . e, vez de , na entrada de numeros.
		ContaCorrente conta;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Número da conta");
		double n = entrada.nextDouble();
		System.out.println("Nome do titular");
		String t = entrada.next();
		System.out.println("Tem algum depósito inicial? (s/n)");
		char c = entrada.next().charAt(0);

//TESTA SE EXISTE UM DEPÓSITO INCIAL
		if(c == 's' || c=='S') {
		System.out.println("Qual o valor do depósito incial");
			double s = entrada.nextDouble();
			conta = new ContaCorrente(n, t, s);
		}else{
			conta = new ContaCorrente(n, t);
		}
		System.out.println("Dados da conta" + conta);
		
//DEPOSITO
		System.out.println("Qual o valor do depósito");
		double vDeposito = entrada.nextDouble();
		conta.fazerDeposito(vDeposito);
		System.out.println("Dados da conta" + conta);
		
		
//SAQUE
		System.out.println("Qual o valor do saque");
		double vSaque = entrada.nextDouble();
		conta.fazerSaque(vSaque);
		System.out.println("Dados da conta" + conta);
		
		entrada.close();
	}

}
