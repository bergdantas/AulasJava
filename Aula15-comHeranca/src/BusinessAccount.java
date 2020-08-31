public class BusinessAccount extends Account{
	private double loanLimit; //limite de empréstimo
	
//CONSTRUTORES	
	public BusinessAccount(int number, String holder, double balance, double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	public BusinessAccount() {
		super();
	}
	
//MÉTODOS DA CLASSE
	public void loan (double amount) { //faz empréstimo
		if(amount <= loanLimit) {
			deposit(amount);
		}
	}
	
@Override
	public String toString() {
		return "BusinessAccount [loanLimit=" + loanLimit + "]";
	}

//SETTERS E GETTERS
	public double getLoanLimit() {
		return loanLimit;
	}	
}