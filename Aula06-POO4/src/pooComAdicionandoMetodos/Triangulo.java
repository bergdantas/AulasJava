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
 * Método que calcula a área de um triângulo
 * @param double a, double b, double c
 * @return double area
 */
	public double cArea(double a, double b, double c) {
		double area;
		double p=(a+b+c)/2.0;
		area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
				
		return area;
	}

/**
 * método que recebe 3 lados e checa se equivalem a um triangulo
 * @param double a, double b, double c
 * @return double
 */	
	public double eTriangulo(double a, double b, double c){
		if(a+b>c && a+c>b && b+c>a) {
			return cArea(a, b, c);
		}
		else {
			System.out.print("Não é um triangulo, logo a área é ");
			return 0.0;
		}
	}
	
}