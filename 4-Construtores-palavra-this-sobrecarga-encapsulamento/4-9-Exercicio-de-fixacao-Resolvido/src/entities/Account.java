package entities;

public class Account {
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		//this.balance = balance;
		deposit(initialDeposit);
	}
	public Integer getNumber() {
		return number;
	}
//	public void setNumber(Integer number) {
//		this.number = number;
//	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	public void withraw(double amount) {
		balance -= amount + 5.0;
	}
	@Override
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);

	}
	
	
	
}
