package data;

public abstract class Contribuinte {
	protected String nome;
	protected Double rendaAnual;

//CONSTRUTORES
	public Contribuinte() {

	}

	public Contribuinte(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

//MÉTODOS DA CLASSE
	public abstract Double calculoImposto();

//SETTERS E GETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

}
