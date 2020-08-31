/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula composição
 */

package model;

public class Departamento {
	private String nome;

//CONSTRUTORES
	public Departamento() {

	}	
	
	public Departamento(String nome) {
		this.nome = nome;
	}

//SETTERS E GETTERS	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
