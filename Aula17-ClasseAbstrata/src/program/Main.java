/**
 * @author Berg Dantas
 * @link bergdantas.github.io
 * 
 * @aula Classe abstrata
 */
package program;

import java.util.ArrayList;
import java.util.List;
import data.Account;
import data.BusinessAccount;
import data.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		List<Account> contas = new ArrayList<>();
		contas.add(new BusinessAccount(1545, "Berg Dantas", 568.24, 568.5));
		contas.add(new SavingsAccount(4785, "Bob Esponja", 2548548.25, 800000.0));

		// somar o saldo de todas as contas
		double sum = 0;
		for (Account acc : contas) {
			sum += acc.getBalance();
		}
		System.out.println(sum);

		// depositar 1 real em todas as contas
		for (Account acc2 : contas) {
			acc2.deposit(1.0);
			System.out.println(acc2.getBalance());
		}
	}
}