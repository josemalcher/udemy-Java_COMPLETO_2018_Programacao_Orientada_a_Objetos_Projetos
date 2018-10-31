package entities;

public class BusinessAccount extends Account {

	private Double LoanLimit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		LoanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return LoanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		LoanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= LoanLimit) {
			balance += amount - 10.0;
		}
	}

	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
	
	
}
