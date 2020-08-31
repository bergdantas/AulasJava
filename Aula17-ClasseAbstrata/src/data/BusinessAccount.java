package data;

public class BusinessAccount extends Account {
	private Double interestRate;

//CONSTRUTORES
	public BusinessAccount() {

	}
	public BusinessAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

//MÉTODOS DA CLASSE
	public void updateBalance() {
		balance+=(interestRate*balance); 
	}
	
//SETTERS E GETTERS
	public Double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
}
