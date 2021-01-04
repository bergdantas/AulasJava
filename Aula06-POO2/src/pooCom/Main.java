/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula POO (Resolvendo problemas com orientação a objetos)
 * Classe, instânciando objetos e atributos
 * 
 * O primeiro exemplo trata da separação do objeto "triângulo" com as seus atributos das
 * outras operações do programa. 
 */

package pooCom;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//ENTRADA DE DADOS
	Scanner entrada = new Scanner(System.in);
		
	Triangulo x = new Triangulo();
	Triangulo y = new Triangulo();
	
	x.a = entrada.nextDouble();
	x.b = entrada.nextDouble();
	x.c = entrada.nextDouble();
	y.a = entrada.nextDouble();
	y.b = entrada.nextDouble();
	y.c = entrada.nextDouble();
	
	double p = (x.a+x.b+x.c)/2.0;
	double areaX = Math.sqrt((p*(p-x.a)*(p-x.b)*(p-x.c)));
	p = (y.a+y.b+y.c)/2.0;
	double areaY = Math.sqrt((p*(p-y.a)*(p-y.b)*(p-y.c)));
	
	System.out.println(areaX);
	System.out.println(areaY);
	
	entrada.close();
	}
}