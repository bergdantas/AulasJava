/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula POO (Resolvendo problemas sem orientação a objetos)
 * programa que recebe os 3 lados de dois triangulos, testa se as medidas
 * são de um triângulo válido e calcula o que tem a maior área.
 */

package pooSem;

public class Main {
	public static void main(String[] args) {
//DEFINIÇÃO DOS DADOS (não fiz via scan para acelerar os testes. Mas pode ser feito!)
		int xa=5, xb=5, xc=9, ya=4, yb=4, yc=4;
		boolean resX = testaMedidasDoTriangulo(xa, xb, xc);
		boolean resY = testaMedidasDoTriangulo(ya, yb, yc);
		
		if(resX == true && resY == true) {
			double xp = (double)(xa+xb+xc)/2; //fazendo o casting
			double areaX = (double)Math.sqrt(xp*(xp-xa)*(xp-xb)*(xp-xc)); //fazendo o casting	 		
			double yp = (double)(ya+yb+yc)/2;  //fazendo o casting
			double areaY = (double)Math.sqrt(yp*(yp-ya)*(yp-yb)*(yp-yc)); //fazendo o casting
			
			System.out.println(areaX);
			System.out.println(areaY);
			
			if (areaX>areaY) {
				System.out.println("X > Y");
			}else {
				System.out.println("Y > X");
			}		
		}else {
			System.out.println("As medidas não correspondem a um triângulo válido");
		}	
	}
	
/**
 * Método que testa se as medidas passadas correspondem a um triângulo válido
 * @param double a 
 * @param double b
 * @param double c
 * @return boolean
 */
	public static boolean testaMedidasDoTriangulo(double a, double b, double c){
		boolean trianguloValido=true;
			if (a+b<c || a+c<b || b+c<a ) {
				trianguloValido = false;
			}
		return trianguloValido;
	}
}
