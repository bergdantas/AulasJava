/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula Exceções
 */

package program;

import java.util.HashSet;
import java.util.Set;
import data.Produto;

public class Main {
    public static void main(String args[]){
//CRIO OBJETOS DO TIPO PRODUTO   	
	    Produto p1 = new Produto("254785", "Café", 3.45, 1);
	    Produto p2 = new Produto("256785", "Biscoito", 4.55, 1);  
	    Produto p3 = new Produto("254785", "Café", 3.45, 1);
	
//CRIA A ESTRUTURA DE DADOS
	    Set<Produto> produtoSet = new HashSet<>(); //se eu quiser manter a ordem de inserção, eu uso a estrutura LinkedHashSet<>()
	    
//ADICIONA DADOS
	    produtoSet.add(p1);
	    produtoSet.add(p2);
	    produtoSet.add(p3);
	    produtoSet.add(p3); //não entra
	    System.out.println(produtoSet);
	
//REMOVE DADOS
	    produtoSet.remove(p3);
	    System.out.println(produtoSet);
	
//VARRE ESTRUTURA
	   	for(Produto p : produtoSet) {
	   		System.out.println(p);
	   	}
	}    
}