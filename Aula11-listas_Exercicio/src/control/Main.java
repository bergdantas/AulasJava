/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula Listas
 */

package control;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.Funcionario;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); //se quiser . e, vez de , na entrada de numeros.
		Scanner entrada = new Scanner(System.in);
		
//DECLARA LISTA
		List<Funcionario> listaDeFuncionarios = new ArrayList<Funcionario>(); // pode ser apenas "new ArrayList<>()"
		System.out.print("Quantos funcionários serão cadastrados? ");
		int tamanhoDaLista = entrada.nextInt();
		
//ENTRADA DE DADOS		
		for (int i=0; i < tamanhoDaLista; i++) {
			System.out.println("Qual o id do funcionário? ");
			int id = entrada.nextInt();
			entrada.nextLine();
			System.out.println("Qual o nome do funcionário? ");			
			String nome = entrada.nextLine();
			System.out.println("Qual o salário do funcionário? ");		
			double salario = entrada.nextDouble();
			Funcionario funcionario = new Funcionario(id, nome, salario); //instancia um funcionario
			listaDeFuncionarios.add(funcionario); //adiciona a lista o funcionario instanciado
		}

//AUMENTA O SALARIO, PASSANDO O ID
		System.out.println("Qual o id do funcionário que se pretende aumentar o salário? ");
		int idComparacao = entrada.nextInt();
		//Integer indice = buscaIndiceDoFuncionario(listaDeFuncionarios, idComparacao); //manual
		Funcionario funcionario = listaDeFuncionarios.stream().filter(x -> x.getId() == idComparacao).findFirst().orElse(null); //automática
		//no manual troco funcionario por indice
		if (funcionario == null) {
			System.out.println("Este ID não existe");
		}else{
			System.out.println(funcionario);
			System.out.println("Qual a % de aumento? ");
			Double percent = entrada.nextDouble();
			//listaDeFuncionarios.get(indice).aumentoDoSalarioDoFuncionario(percent);
			funcionario.aumentoDoSalarioDoFuncionario(percent);
		}
				
		System.out.println(listaDeFuncionarios);
		entrada.close();
	}
	
//FUNCAO BUSCA ID NA LISTA	
	public static Integer buscaIndiceDoFuncionario(List<Funcionario> listaDeBusca, int id) {
		for(int i=0; i < listaDeBusca.size(); i++) {
			if(listaDeBusca.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}