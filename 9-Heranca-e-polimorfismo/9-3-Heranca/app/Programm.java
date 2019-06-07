package app;

import entities.Acconunt;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Programm {
    public static void main(String[] args) {

        Acconunt acc = new Acconunt(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Jose", 0.0, 500.00);

        /* UPCASTING */
        Acconunt acc1 = bacc;
        Acconunt acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Acconunt acc3 = new SavingsAccount(1004, "Anna", 0.0, 10.0);

        // DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.00);

        //BusinessAccount acc5 = (BusinessAccount) acc3; // acc3 -> é um SavingsAccount | Dará erro em tempo de execução

        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.00);
            System.out.println("LOAN!");
        }
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("UPDATE");
        }
    }
}
