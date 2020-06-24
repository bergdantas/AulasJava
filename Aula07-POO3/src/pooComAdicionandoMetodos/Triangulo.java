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
		
		System.out.println(area);
		
		return area;
	}
}