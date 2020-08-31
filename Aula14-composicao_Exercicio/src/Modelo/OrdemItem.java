package Modelo;

public class OrdemItem {
	private int quantidade;
	private double preco;
	private Produto produto;

//CONSTRUTORES	
	public OrdemItem() {
	}

	public OrdemItem(int quantidade, double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}
//SETTERS E GETTERS

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "Nome: "
				+ getProduto().getNome() 
				+", $" 
				+ getProduto().getPreco() 
				+ ", Quantidade: "
				+ quantidade
				+ ", subtotal: "
				+ subTotal();
	}
	
	public double subTotal() {
		preco = getProduto().getPreco() * quantidade;
		return preco;
	}	
}
	
	

