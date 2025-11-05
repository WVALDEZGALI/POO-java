package H_OOP;

public class BankAccount {

    Integer balance;

    public BankAccount(Integer balance){
        this.balance = balance;
    }

    public Integer deposit(Integer num){
        int total = num + balance;
        return total;
    }

}
