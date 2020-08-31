package data;

public class PessoaJuridica extends Contribuinte {
	private Integer quantidadeDeFuncionarios;

//CONSTRUTOR
	public PessoaJuridica(String nome, Double rendaAnual, Integer quantidadeDeFuncionarios) {
		super(nome, rendaAnual);
		this.quantidadeDeFuncionarios = quantidadeDeFuncionarios;
	}

//MÉTODO DA CLASSE
	@Override
	public Double calculoImposto() {
		double imposto = 0;

		if (quantidadeDeFuncionarios < 10) {
			imposto = getRendaAnual() * 0.16;
		} else {
			imposto = getRendaAnual() * 0.14;
		}
		System.out.println(imposto);
		return imposto;
	}
}
