package app;

import entities.Account;
import entities.BussinessAccount;
import entities.SavingsAccount;

public class program132 {
    public static void main(String[] args) {
        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(200);
        System.out.println(acc1.getBalance()); //  795.0

        Account acc2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01);
        acc2.withdraw(200);
        System.out.println(acc2.getBalance());// 800.0

        Account acc3 = new BussinessAccount(1004, "bob", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());//  793.0
    }
}
