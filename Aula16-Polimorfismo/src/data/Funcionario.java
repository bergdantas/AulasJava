package data;

public class Funcionario {
	protected String nome;
	protected Integer horas;
	protected Double valorPorHora;

//CONSTRUTORES
	public Funcionario() {

	}
	public Funcionario(String nome, Integer horas, Double valorPorHora) {
		super();
		this.nome = nome;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
	}

//MÉTODOS DA CLASSE
	public double pagamento() {
		return horas*valorPorHora;
	}
	
	@Override
	public String toString() {
	return nome + " trabalha " + horas + " horas. E o valor da hora é " + valorPorHora + " reais. E o salário final foi de " + this.pagamento();
	}	
//SETTERS E GETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getHoras() {
		return horas;
	}
	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	public Double getValorPorHora() {
		return valorPorHora;
	}
	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}	
}
