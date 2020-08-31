
//public final class SavingsAccount extends Account{ //dá erro na classe SavingsAccountPlus. Pois classe final não pode ser extendida 
public class SavingsAccount extends Account{
	private double interestRate; // tx de juros

//CONSTRUTORES
	public SavingsAccount() {
		super();
	}
	public SavingsAccount(int number, String holder, double balance, double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

//MÉTODOS DA CLASSE 
	public void updateBalance(){ //calculo de juros
		balance += interestRate;
	}
	
	@Override
	public final void withDraw(double amount) { //saque
		//balance -= (amount-5);
		//ou
		super.withDraw(amount);
		balance -= 2;
	}	

	@Override
	public void deposit(double amount) { //depósito
		balance += (amount-2);
	}
	
	@Override
	public String toString() {
		return "SavingsAccount [interestRate=" + interestRate + "]";
	}
	
	//SETTERS E GETTERS
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}
