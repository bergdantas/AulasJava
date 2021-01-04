/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula POO (Resolvendo problemas com orientação a objetos)
 * Métodos
 */

package pooComAdicionandoMetodos;

public class Triangulo {
	double a, b, c;	
/**
 * Método que calcula a área de um triangulo
 * 
 * @return double
 */
	public double cArea() {
		double area;
		double p=(a+b+c)/2.0;
		area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
				
		return area;
	}

/**
 * método que checa se um triangulo é válido.
 * @param double a, double b, double c
 * @return double
 */	
	public boolean eTriangulo(double a, double b, double c){
		if(a+b>c && a+c>b && b+c>a) {
			return true;
		}
		else {
			return false;
		}
	}
	
}