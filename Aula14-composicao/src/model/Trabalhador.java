/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula composição
 */

package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import model.enumer.NivelDoTrabalhador;

public class Trabalhador {
	private String nome;
	private NivelDoTrabalhador nivel;
	private double salario;

//ASSOCIAÇÕES E COMPOSIÇÕES	
	private Departamento departamento;
	private List<Contrato> contratos = new ArrayList<>();

//CONSTRUTOREES
	public Trabalhador() {

	}

	public Trabalhador(String nome, NivelDoTrabalhador nivel, double salario, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
		this.departamento = departamento;
	}

//SETTERS E GETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelDoTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelDoTrabalhador nivel) {
		this.nivel = nivel;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Contrato> getContrato() {
		return contratos;
	}

	/*
	 * TORNO IMPOSSIVEL QUALQUER ALTERAÇÃO OU SUBSTITUIÇÃO NA/DA LISTA
	 * 
	 * public void setContrato(List<Contrato> contrato) { this.contrato = contrato;
	 * }
	 */

	/**
	 * 
	 * CRIA A ASSOCIAÇÃO ENTRE UM CONTRATO E UM FUNCIONÁRIO
	 * 
	 * @param contrato
	 * @return void
	 * 
	 */
	public void addContrato(Contrato contrato) {
		this.contratos.add(contrato);
	}

	/**
	 * 
	 * DESFAZ A ASSOCIAÇÃO ENTRE UM CONTRATO E UM FUNCIONÁRIO
	 * 
	 * @param contrato
	 * @return void
	 * 
	 */
	public void removeContrato(Contrato contrato) {
		this.contratos.remove(contrato);
	}

	/**
	 * 
	 * Busca a renda de um contrato em um dado mes/ano
	 * 
	 * @param ano
	 * @param mes
	 * @return double
	 */
	public double buscaDaRendaPeloMesAno(int mes, int ano) {
		double renda = salario;
		Calendar cal = Calendar.getInstance();
		for (Contrato c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1+cal.get(Calendar.MONTH);
			if (ano == c_ano && mes == c_mes) {
				renda += c.valorDosContratos();
			}
		}
		return renda;
	}
}