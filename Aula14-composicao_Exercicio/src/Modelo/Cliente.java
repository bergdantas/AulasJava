package Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	private static SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nome;
	private String email;
	private Date dataDeNascimento;
	
//CONSTRUTORES
	public Cliente() {
	}

	public Cliente(String nome, String email, Date dataDeNascimento) {
		this.nome = nome;
		this.email = email;
		this.dataDeNascimento = dataDeNascimento;
	}
//SETTERS E GETTERS

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

//SOBESCRITA DO TOSTRING
	public String toString() {
		return "Cliente: " 
				+ nome 
				+ " (" 
				+ dataFormatada.format(dataDeNascimento) 
				+ ")"
				+ " - " 
				+ email;
	}
		
}
