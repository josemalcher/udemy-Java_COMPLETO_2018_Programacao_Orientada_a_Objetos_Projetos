package app;

import entities.Account;
import entities.BussinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc  = new Account(1001, "alex", 0.0);
        BussinessAccount bacc = new BussinessAccount(1002, "maria", 0.0, 500.0);

        //UPCASTING
        Account acc1 = bacc;

        Account acc2 = new BussinessAccount(1003, "bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "jose", 0.0, 400.0);

        //DOWNCASTING

        //BussinessAccount acc4 = acc2;
        BussinessAccount acc4 = (BussinessAccount) acc2;
        acc4.loan(100.0);

        // BussinessAccount acc5 = (BussinessAccount) acc3;
        /*
        Exception in thread "main" java.lang.ClassCastException: class entities.SavingsAccount cannot be cast to class entities.BussinessAccount (entities.SavingsAccount and entities.BussinessAccount are in unnamed module of loader 'app')
	at app.Program.main(Program.java:24)
        */

        if (acc3 instanceof BussinessAccount) {
            BussinessAccount acc5 = (BussinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("LOAN");
        }
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.upadteBalance();
            System.out.println("Update");
        }
    }
}
