package data;

public class SavingsAccount extends Account {
	private Double loanLimit;

//CONSTRUTORES
	public SavingsAccount() {

	}

	public SavingsAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

//MÉTODOS DA CLASSE
	public void Loan(double amount) {
		balance -= loanLimit;
	}

//SETTERS E GETTERS 
	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
}
