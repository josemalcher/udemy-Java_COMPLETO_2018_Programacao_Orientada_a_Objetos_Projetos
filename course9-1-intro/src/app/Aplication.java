package app;

import entities.BusinessAccount;

public class Aplication {

	public static void main(String[] args) {

		BusinessAccount account = new BusinessAccount("José Malcher", 8010, 100.0 , 500.00);
		
		account.loan(0.0);
		System.out.println(account.getBalance());

	}

}
