package Modelo;

public class Produto {
	private String nome;
	private double preco;

//CONSTRUTORES	
	public Produto() {
	}
	public Produto(String nome, double preco) {
		this.preco = preco;
		this.nome = nome;
	}

//SETTERS E GETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
@Override
	public String toString() {
		return "Produto [nome=" 
				+ nome 
				+ ", preco=" 
				+ preco + "]";
	}
}
