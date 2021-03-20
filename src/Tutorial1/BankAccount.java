package Tutorial1;

public class BankAccount implements Account{
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int deposit(int amountOfDeposit){
        balance += amountOfDeposit;
        return balance;
    }

    public boolean withdraw(int amountOfWithdraw){
        if(amountOfWithdraw <= balance){
            balance -= amountOfWithdraw;
            return true;
        }
        else
            return false;
    }
}

