/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula POO (Resolvendo problemas com orientação a objetos)
 * Métodos
 */

package pooComAdicionandoMetodos;

public class Main {

	public static void main(String[] args) {
//INSTANCIAÇAO DE OBJETOS
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();

//INICIALIZANDO OS OBJETOS 
		x.a=5;
		x.b=6;
		x.c=7;
		y.a=3;
		y.b=7;
		y.c=7;

//CHAMANDO O MÉTODO cArea() DA CLASSE TRIANGULO 
		double areaX = x.cArea();
		double areaY = y.cArea();	 
			
	}

}
