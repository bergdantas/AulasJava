/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula POO (Resolvendo problemas com orientação a objetos)
 * Vetores
 */

package operacoesComVetores;

public class Aluno {
	private String nome;
	private String email;

//CONSTRUTORES
	public Aluno(String nome, String email) {
	this.nome = nome;
	this.email = email;
	}
	
	public Aluno() {

	}	

//SOBRESCRITA DO MÉTODO TOSTRING
	public String toString() {
		return "Aluno [nome=" + nome + ", email=" + email + "]";
	}

//SETTERS E GETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
