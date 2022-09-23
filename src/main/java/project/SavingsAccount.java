package project;

public class SavingsAccount {
    private double balance;
    private int accountNumber;
    private double interest;

    public SavingsAccount(double balance, int accountNumber, double interest) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.interest = interest;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getInterest() {
        return interest;
    }

    public void deposit(double addMoney) {
        balance += addMoney;
    }

    public void withdraw(double takeMoney) {
        while (takeMoney < balance) {
            balance -= takeMoney;
        }
    }

    public double accrueInterest() {
       balance = interest * balance + balance;
       return balance;
    }

}
