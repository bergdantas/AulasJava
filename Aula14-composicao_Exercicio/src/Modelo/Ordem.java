package Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ordem {
	private Date dataDaCompra;
	private StatusOrdem statusDaCompra;
	private Cliente cliente;
	private List<OrdemItem> itensDaCompra = new ArrayList<>();

//CONSTRUTORES

	public Ordem() {
	}
	public Ordem(Date dataDaCompra, StatusOrdem statusDaCompra, Cliente cliente) {
		this.dataDaCompra = dataDaCompra;
		this.statusDaCompra = statusDaCompra;
		this.cliente = cliente;
	}
	
//SETTERS E GETTERS
	public Date getDataDaCompra() {
		return dataDaCompra;
	}
	public void setDataDaCompra(Date dataDaCompra) {
		this.dataDaCompra = dataDaCompra;
	}
	public StatusOrdem getStatusDaCompra() {
		return statusDaCompra;
	}
	public void setStatusDaCompra(StatusOrdem statusDaCompra) {
		this.statusDaCompra = statusDaCompra;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
//SOBESCREVE O TOSTRING
	public String toString() {
		return "Data da compra: " 
				+ dataDaCompra 
				+ "\n"
				+ "statusDaCompra: " 
				+ statusDaCompra;
	}
	
	public void addProdutoNaLista(OrdemItem ordemItem) {
		itensDaCompra.add(ordemItem);
	}	
	
	public void removeProdutoNaLista(OrdemItem ordemItem) {
		itensDaCompra.remove(ordemItem);
	}

	public double totalDaCompra() {
		double total = 0;
		//for (OrdemItem it: itensDaCompra) {
		//	total = total + it.subTotal();
		//}
		for (int i=0; i < itensDaCompra.size(); i++) {
			total = total + itensDaCompra.get(i).subTotal();
		}
		return total;
	}
}
