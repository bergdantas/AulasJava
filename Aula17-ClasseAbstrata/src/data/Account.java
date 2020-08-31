package data;

public abstract class Account {
	protected Integer number;
	protected String holder;
	protected Double balance;

//CONSTRUTORES	
	public Account() {

	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

//MÉTODOS DA CLASSE	
	public void withDraw(double amount) {
		balance -= amount;
	}

	public void deposit(double amount) {
		balance += amount;
	}

//SETTERS E GETTERS	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
}
