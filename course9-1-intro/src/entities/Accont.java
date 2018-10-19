package entities;

public class Accont {

	private String holder;
	private Integer number;
	protected Double balance;

	public Accont() {
	}

	public Accont(String holder, Integer number, Double balance) {
		this.holder = holder;
		this.number = number;
		this.balance = balance;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Double getBalance() {
		return balance;
	}
	/*public void setBalance(Double balance) {
		this.balance = balance;
	}*/

	public void withDraw(double amount) {
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	
}
