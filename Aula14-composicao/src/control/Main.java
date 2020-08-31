/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula composição
 */

package control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.Contrato;
import model.Departamento;
import model.Trabalhador;
import model.enumer.NivelDoTrabalhador;

public class Main {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
		
//ENTRADA DE DADOS
		System.out.println("Qual o departamento");
		String entradaDepartamento = entrada.next();
		System.out.println("Qual o nome do funcionário");
		String entradaNome = entrada.nextLine();
		System.out.println("Nível do funcionário");
		String entradaNivel = entrada.next();
		System.out.println("Salario base do funcionário");
		Double entradaSalario = entrada.nextDouble();
		Trabalhador trabalhador = new Trabalhador(entradaNome, NivelDoTrabalhador.valueOf(entradaNivel),
				entradaSalario,new Departamento(entradaDepartamento));

		System.out.println("Quantos contratos o trabalhador tem?");
		int entradaQdeContratos = entrada.nextInt();
//ADICIONA CONTRATOS A LISTA
		for (int i = 0; i < entradaQdeContratos; i++) {
			System.out.println("Dados do contrato" + " #" +(i+1)	);
			System.out.println("Data (DD/MM/AAAA)");
			Date entradaData = formatoData.parse(entrada.next());
			System.out.println("Valor por hora");
			double entradaValorPorHora = entrada.nextDouble();
			System.out.println("Duração");
			int entradaDuracao = entrada.nextInt();
			Contrato c = new Contrato(entradaData, entradaValorPorHora, entradaDuracao);
			trabalhador.addContrato(c);
		}

//BUSCA NA LISTA
		System.out.println("Qual o mes e o ano? MM/AAAA");
		String mesAno = entrada.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		System.out.println("Nome " + trabalhador.getNome());
		System.out.println("Depto " + trabalhador.getDepartamento().getNome());
		System.out.println("Valor " + mesAno + " " + trabalhador.buscaDaRendaPeloMesAno(mes, ano));
		
		entrada.close();

	}
}
