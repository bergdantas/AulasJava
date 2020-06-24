/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula Membros estáticos
 */

public class Cambio {
	/**
	 * método que calcula o custo em reais de um valor X de dólares
	 * 
	 * @param valorDoDolar
	 * @param vouComprar
	 * @return
	 */
	public static double calcularPreço(double valorDoDolar, double vouComprar) {
		double res = (valorDoDolar * vouComprar) + 0.06*(valorDoDolar * vouComprar);
		System.out.println(res);
		return res;
	}
}
