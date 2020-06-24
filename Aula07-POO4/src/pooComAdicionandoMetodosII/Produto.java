/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula POO (Resolvendo problemas com orientação a objetos)
 * Atribuição de responsábilidades (alta coesão, baixo acoplamento)
 */

package pooComAdicionandoMetodosII;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;

/**
 * 	calcula o valor total dos produtos em estoque
 * 
 * @return double 
 */
	public double totalValorDoEstoque() {
		System.out.println(quantidade*preco);
		return quantidade * preco;
	}

/**
 * método para adicionar unidades de um produto no estoque
 * 
 * @param int quantidade
 * 
 */
	public void addProduto(int quantidade) {
		this.quantidade += quantidade; //this se refere ao atributo e não ao paramero
		System.out.println("A quantidade do produto é " + this.quantidade);
	}

/**
 * método para remover produtos do estoque
 * 
 * @param int quantidade
 */
	public void remProduto(int quantidade) {
		if(this.quantidade-quantidade >= 0){
			this.quantidade-= quantidade;
			System.out.println("A quantidade do produto é " + this.quantidade);
		}else {
			System.out.println("Não vai rolar, bro");
		}
	}
}
