package entities;

public class BusinessAccount extends Accont{
	
	private Double loanLimt;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(String holder, Integer number, Double balance, Double loanLimt) {
		super(holder, number, balance);
		this.loanLimt = loanLimt;
	}

	public Double getLoanLimt() {
		return loanLimt; 
	}

	public void setLoanLimt(Double loanLimt) {
		this.loanLimt = loanLimt;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimt) {
			balance += amount - 10.0;
		}
	}

}
