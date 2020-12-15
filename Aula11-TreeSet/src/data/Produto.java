package data;

public class Produto {
	private String serialNumber;
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(String serialNumber, String nome, double preco, int quantidade) {
		this.serialNumber = serialNumber;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	

	@Override
	public String toString() {
		return "serialNumber=" 
				+ serialNumber 
				+ ", nome=" 
				+ nome 
				+ ", preco=" 
				+ preco 
				+ ", quantidade="
				+ quantidade
				+ "___________";
	}


	public String getSerialNunber() {
		return serialNumber;
	}

	public void serialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void alteraPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public int compra(int i) {
		return quantidade = quantidade + i;
	}

	public int venda(int i) {
		return quantidade = quantidade - i;
	}
}
