/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula POO (código sem comentários, para exercício de alunos.)
 */

package pooComAdicionandoMetodosII;

public class Main {

	public static void main(String[] args) {

		Produto p1 = new Produto();
	
		p1.nome="Café extra forte";
		p1.preco=4;
		p1.quantidade=20;

		p1.addProduto(10);
		p1.remProduto(25);
		p1.totalValorDoEstoque();	
	}
}