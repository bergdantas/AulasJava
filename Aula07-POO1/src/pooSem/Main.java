/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula POO (Resolvendo problemas sem orientação a objetos)
 */

package pooSem;

public class Main {
	public static void main(String[] args) {
//DEFINIÇÃO DOS DADOS (não fiz via scan)
		int xa=5;
		int xb=5;
		int xc=9;
		int ya=4;
		int yb=4;
		int yc=4;
		boolean resX = testaMedidasDoTriangulo(xa, xb, xc);
		boolean resY = testaMedidasDoTriangulo(ya, yb, yc);
		
//ESTRUTURA CONDICIONAL		
		if(resX == true && resY == true) {
			double xp = (double)(xa+xb+xc)/2;
			double areaX = (double)Math.sqrt(xp*(xp-xa)*(xp-xb)*(xp-xc));			
			double yp = (double)(ya+yb+yc)/2;
			double areaY = (double)Math.sqrt(yp*(yp-ya)*(yp-yb)*(yp-yc));
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
 * 
 * @param double a 
 * @param double b
 * @param double c
 * @return boolean
 */
	public static boolean testaMedidasDoTriangulo(double a, double b, double c){
		boolean trianguloValido=true;
		
//ESTRUTURA CONDICIONAL
		if (a+b<c || a+c<b || b+c<a ) {
			trianguloValido = false;
		}
		return trianguloValido;
	}
}
