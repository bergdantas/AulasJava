public class BusinessAccount {
	private int number; //numero da conta
	private String holder; //titular da conta
	private double balance; //saldo
	private double loanLimit; //limite de empréstimo
	
//CONSTRUTORES	
	public BusinessAccount(int number, String holder, double balance, double loanLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.loanLimit = loanLimit;
	}	
	public BusinessAccount() {
		super();
	}
	
//MÉTODOS DA CLASSE
	public void withDraw(double amount) { //saque
		balance -= amount;
	}	
	
	public void deposit(double amount) { //depósito
		balance += amount;
	}
	public void loan (double amount) { //faz empréstimo
		if(amount <= loanLimit) {
			deposit(amount);
		}
	}
	
	@Override
	public String toString() {
		return "BusinessAccount [number=" + number + ", holder=" + holder + ", balance=" + balance + ", loanLimit="
				+ loanLimit + "]";
	}
	
	//SETTERS E GETTERS
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	public double getLoanLimit() {
		return loanLimit;
	}	
}