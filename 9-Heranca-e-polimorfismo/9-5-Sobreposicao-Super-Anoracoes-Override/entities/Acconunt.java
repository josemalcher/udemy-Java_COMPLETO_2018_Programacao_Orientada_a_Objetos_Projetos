package entities;

public class Acconunt {
    private Integer number;
    private String holder;
    //private Double balance;
    protected Double balance;

    public Acconunt() {
    }

    public Acconunt(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

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

    /* ------------- Methods ------------------- */

    public void withdraw(double amount){
        balance -= amount + 5.0;
    }
    public void deposit(double amount){
        balance += amount;
    }
}
