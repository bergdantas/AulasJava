/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula polimorfismo
 */
package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import data.Funcionario;
import data.FuncionarioTerceirizado;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Funcionario> listaDeFuncionarios = new ArrayList<>();
		Funcionario f1 = new Funcionario();
		Scanner leitura = new Scanner(System.in);

//ENTRADA DE DADOS
		System.out.println("Digite a quantidade de funcionários de deseja ser inserida");
		int QuantidadeDeFuncionarios = leitura.nextInt();

		for (int i = 0; i < QuantidadeDeFuncionarios; i++) {
			System.out.println("O funcionário é terceirizado? (true/false)");
			boolean eTerceirizado = leitura.nextBoolean();
			leitura.nextLine(); //limpa o buffer antes de ler o nextLine() relevante
			
			System.out.println("Nome do funcionário");
			String nome = leitura.nextLine();

			System.out.println("Horas trabalhadas");
			int hora = leitura.nextInt();

			System.out.println("Valor por hora trabalhada");
			double valorDaHora = leitura.nextDouble();

			// teste pra saber se o funcionário é ou não terceirizado
			if (eTerceirizado) {
				System.out.println("Quantidade de horas extras");
				double cargaAdicional = leitura.nextDouble();

				f1 = new FuncionarioTerceirizado(nome, hora, valorDaHora, cargaAdicional);
				//System.out.println(f1);

			} else {
				f1 = new Funcionario(nome, hora, valorDaHora);
				//System.out.println(f1);

			}

			listaDeFuncionarios.add(f1);
		}

			System.out.println(listaDeFuncionarios);

		leitura.close();
	}

}