/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula Listas
 */

package operacoesComLists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
//DECLARA LISTA
		List<Integer> listInt = new ArrayList<>(); //Tenho que usar wraper class
		
//INICIALIZA LISTA
		listInt.add(0);
		listInt.add(24);
		listInt.add(54);
		listInt.add(34);
		
		System.out.println(listInt);
		
		//laço for each		
		//for (Integer s : listInt) {		
		//	System.out.println(s);
		//}
		
//ADICIONAR VALOR NA LISTA
		listInt.add(2, 0); //POS  VAL
		listInt.add(1, 10); //POS  VAL
		System.out.println(listInt);		
	
//REMOVER VALOR DA LISTA 
		listInt.remove(4); //POS (se for string, "Nome" apara o campo com valor "Nome")
		System.out.println(listInt);
		listInt.removeIf(x -> x<10); //funcao lambda (predicado se retorna v ou f)
		System.out.println(listInt);
		
//BUSCA NA LISTA
		System.out.println("indexOf 10: " + listInt.indexOf(10)); //retorna posição do elemento 10. Se o elemento não existir, o retorno é -1.
		List<Integer> resultado = listInt.stream().filter(x -> x>23).collect(Collectors.toList()); //filtragem na lista
		System.out.println(resultado);
		Integer pesquisa =  listInt.stream().filter(x -> x>23).findFirst().orElse(null); //filtragem na lista (primeiro elemento)
		System.out.println(pesquisa);
	}
}
