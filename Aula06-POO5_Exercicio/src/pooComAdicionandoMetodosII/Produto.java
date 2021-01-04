/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula POO (código sem comentários, para exercício de alunos.)
 */

package pooComAdicionandoMetodosII;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;

	public double totalValorDoEstoque() {
		System.out.println(quantidade*preco);
		return quantidade * preco;
	}

	public void addProduto(int quantidade) {
		this.quantidade += quantidade; //this se refere ao atributo e não ao paramero
		System.out.println("A quantidade do produto é " + this.quantidade);
	}

	public void remProduto(int quantidade) {
		if(this.quantidade-quantidade >= 0){
			this.quantidade-= quantidade;
			System.out.println("A quantidade do produto é " + this.quantidade);
		}else {
			System.out.println("Não vai rolar, bro");
		}
	}
}
