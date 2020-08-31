/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula herança
 */
package Programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Modelo.Cliente;
import Modelo.Ordem;
import Modelo.OrdemItem;
import Modelo.Produto;
import Modelo.StatusOrdem;;  

public class Main {
	public static void main (String[] args) throws ParseException {
		SimpleDateFormat formatoDaData = new SimpleDateFormat("dd/MM/yyyy");
		Scanner entradaDeDados = new Scanner(System.in);

//ENTRADA DE DADOS		
		System.out.println("Digite o nome");
		String _nome = entradaDeDados.next();
		System.out.println("Digite o e-mail");
		String _email = entradaDeDados.next();
		System.out.println("Digite a data de nascimento");
		Date _dataNascimento = formatoDaData.parse(entradaDeDados.next());
		Cliente _cliente = new Cliente(_nome, _email, _dataNascimento);
				
		System.out.println("Qual o status da Compra?");
		String _statusCompra = entradaDeDados.next();
		StatusOrdem statusOrdem = StatusOrdem.valueOf(_statusCompra);
		//StatusOrdem statusOrdem2 = statusOrdem.valueOf(entradaDeDados.next());
		Ordem _ordem = new Ordem(new Date(), statusOrdem, _cliente);
		
		System.out.println("Quantos itens serão comprados?");
		int _qdeItens = entradaDeDados.nextInt();
		for (int i = 0; i < _qdeItens; i++) {
			System.out.println("Qual o produto?");
			String _nomeDoProduto = entradaDeDados.next();
			System.out.println("Quantos itens serão comprados?");
			int _quatidadeDoProduto = entradaDeDados.nextInt();
			System.out.println("Qual o preço da unidade do produto?");
			double _precoDoProduto = entradaDeDados.nextDouble();

//CRIO OBJETOS DO TIPO PRODUTO E ITEM DA ORDEM
			Produto _produto = new Produto(_nomeDoProduto, _precoDoProduto);
			OrdemItem _ordemItem = new OrdemItem(_quatidadeDoProduto, 
					_quatidadeDoProduto*_precoDoProduto, 
					_produto);

//ADICIONO O PRODUTO NA LISTA			
			_ordem.addProdutoNaLista(_ordemItem);
			
			System.out.println(_ordemItem);
			System.out.println(_cliente);

		}
		
		System.out.println(_ordem);
		System.out.println(_ordem.totalDaCompra());
		
		entradaDeDados.close();
	}
}
