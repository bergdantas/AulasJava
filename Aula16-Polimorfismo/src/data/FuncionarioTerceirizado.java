package data;

public class FuncionarioTerceirizado extends Funcionario{
	private Double cargaAdicional;

//CONSTRUTORES
	public FuncionarioTerceirizado() {
		super();
	}
	public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, Double cargaAdicional) {
		super(nome, horas, valorPorHora);
		this.cargaAdicional = cargaAdicional;
	}
//MÉTODOS DA CLASSE
	@Override
	public double pagamento() {
		return horas*valorPorHora*1.1;
	}
	
	@Override
	public String toString() {
		return nome + " trabalha " + horas + " horas. E o valor da hora é " + valorPorHora + " reais. Além disso o tem uma carga adicional de " + cargaAdicional + " horas. E o salário final foi de " + this.pagamento();
	}
	
	//SETTERS E GETTERS
	public Double getCargaAdicional() {
		return cargaAdicional;
	}
	public void setCargaAdicional(Double cargaAdicional) {
		this.cargaAdicional = cargaAdicional;
	}
}
