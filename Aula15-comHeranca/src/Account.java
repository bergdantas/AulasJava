public class Account {
	protected int number; //numero da conta
	protected String holder; //titular da conta
	protected double balance; //saldo

//CONSTRUTORES	
	public Account(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	public Account () {
		
	}
	
//MÉTODOS DA CLASSE
	public void withDraw(double amount) { //saque
		balance -= amount + 5.0;
	}	

	public void deposit(double amount) { //depósito
		balance += amount;
	}

@Override
	public String toString() {
		return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + "]";
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
}
