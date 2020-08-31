package data;

public class PessoaFisica extends Contribuinte {
	protected Double gastoComSaude;

//CONSTRUTORES
	public PessoaFisica() {

	}

//MÉTODOS DA CLASSE
	public PessoaFisica(String nome, Double rendaAnual, Double gastoComSaude) {
		super(nome, rendaAnual);
		this.gastoComSaude = gastoComSaude;
	}

	@Override
	public Double calculoImposto() {
		double imposto = 0.0;
		if (getRendaAnual() < 20000) {
			imposto = getRendaAnual() * 0.15;
		} else {
			imposto = getRendaAnual() * 0.25;
		}

		imposto = imposto - (gastoComSaude / 2);

		System.out.println(imposto);
		return imposto;
	}
}
