
public class SavingsAccountPlus extends SavingsAccount {
	private double bonus;

//CONSTRUTORES
	public SavingsAccountPlus() {
		
	}
	public SavingsAccountPlus(int number, String holder, double balance, double interestRate, double bonus) {
		super(number, holder, balance, interestRate);
		this.bonus=bonus;
	}

//SETTERS E GETTERS	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	//Não funciona, pois o na superclasse SavingAccount esse método foi definido  como final  
	//@Override
	//public void withDraw(double amount) { //saque
	//	super.withDraw(amount);
	//}	
	
}
