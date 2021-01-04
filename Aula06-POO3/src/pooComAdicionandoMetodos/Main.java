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
		x.a=35;
		x.b=6;
		x.c=7;
		y.a=3;
		y.b=7;
		y.c=7;

		
//CHAMANDO O MÉTODO eTringulo() DA CLASSE TRIANGULO 
		boolean tX = x.eTriangulo(x.a, x.b, x.c);
		boolean tY = y.eTriangulo(y.a, y.b, y.c);
		//System.out.println(tX);
		//System.out.println(tY);

//CHAMANDO O MÉTODO cArea() DA CLASSE TRIANGULO 
		if (tX == true) {
			double areaX = x.cArea();
			System.out.println(areaX);

		}else{
			System.out.println("Não é triângulo");
		}
		
		if (tY == true) {
			double areaY = y.cArea();
			System.out.println(areaY);
		}else{
			System.out.println("Não é triângulo");
		}
		
	
	}

}
