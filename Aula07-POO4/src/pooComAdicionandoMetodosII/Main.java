/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula POO (Resolvendo problemas com orientação a objetos)
 * Atribuição de responsábilidades (alta coesão, baixo acoplamento)
 */

package pooComAdicionandoMetodosII;

public class Main {

	public static void main(String[] args) {
//CRIA UM PRODUTO NOVO
		Produto p1 = new Produto();
		
//INICIALIZA O PRODUTO
		p1.nome="Café extra forte";
		p1.preco=4;
		p1.quantidade=20;

//INVOCA OS MÉTODOS DEFINIDOS EM PRODUTO (ADICIONAR, REMOVER E CALCULAR O VALOR DO ESTOQUE)		
		p1.addProduto(10);
		p1.remProduto(25);
		p1.totalValorDoEstoque();
		
	}

}
