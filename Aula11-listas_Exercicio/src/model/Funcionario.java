/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula Listas
 */

package model;

public class Funcionario {
	private Integer id;
	private String nome;
	private Double salario;

//CONSTRUTOR	
	public Funcionario(Integer id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

/**
 * Método que calcula o aumento de salário
 * @param porcentagemAumento
 */
	public void aumentoDoSalarioDoFuncionario (double porcentagemAumento) {
		salario = salario + (salario * (porcentagemAumento / 100.0));
	}

//SOBRESCRITA
	public String toString(){
		return "id: " +
				id + 
				" | nome: " +
				nome +
				" | salario: " +
				salario;
	}
//SETTERS E GETTERS

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
		
}
