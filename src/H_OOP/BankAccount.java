package H_OOP;

public class BankAccount {

    int balance;

    public BankAccount(int balance){
        this.balance = balance;
    }

    public int deposit(int amount){
        balance = balance + amount;
        return balance;
    }

}
