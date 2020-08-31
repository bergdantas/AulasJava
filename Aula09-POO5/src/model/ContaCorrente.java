/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula POO (Resolvendo problemas com orientação a objetos)
 * Construtores, encapsulamento, getters e setters
 */

package model;

public class ContaCorrente {
	private double numeroDaConta;
	private String nomeDoTitular;
	private double saldo;
	private static final double TAXA = 5.00;

//CONSTRUTORES	
	public ContaCorrente(double numeroDaConta, String nomeDoTitular, double depositoInicial) {
		this.numeroDaConta = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;
		fazerDeposito(depositoInicial); //protejo o construtor de mudanças na regra de negocio de deposito
	}	
	
	public ContaCorrente(double numeroDaConta, String nomeDoTitular) {
		this.numeroDaConta = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;
	}	

/**
 * Método usado para fazer um depósito
 * 	
 * @param valor
 */
	public void fazerDeposito(double valor) {
		saldo+=valor;		
	}

/**
 * Método usado para fazer o saque
 * 
 * @param double valor
 */
	public void fazerSaque(double valor) {
		saldo -= valor + TAXA;		
	}

// SOBRESCRITA DO MÉTODO TOSTRING
	public String toString() {
		return "Conta " 
				+ numeroDaConta
				+ " | Titular "
				+ nomeDoTitular
				+ " | Saldo "
				+ saldo;
	}
//SETTERS E GETTERS	
	public double getNumeroDaConta() {
		return numeroDaConta;
	}

	public String getnomeDoTitular() {
		return nomeDoTitular;
	}

	public void setnomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}

	public double getSaldo() {
		return saldo;
	}

}
