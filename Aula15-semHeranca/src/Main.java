/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula herança
 */
public class Main {
	public static void main(String[] args) {
//INSTANCIAS DE ACCOUNT E BUSINESSACOUNT
	Account c1 = new Account(2558, "Danilo Silva", 1524.00);
	BusinessAccount c2 = new BusinessAccount(5587, "Fake Corp", 58754.63, 50000.00);
	
	System.out.println(c1);
	System.out.println(c2);
	}
}