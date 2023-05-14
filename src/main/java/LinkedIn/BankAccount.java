package LinkedIn;

public class BankAccount {
    private double balance;
    private final double minimumBalance;
    private boolean isActive = true;

    private String accountHolder;

    public BankAccount(double balance,double minimumBalance) {
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    public double getBalance() {
        return balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public double withdraw(double amount){
        if(balance - amount > minimumBalance){
            balance -= amount;
            return  amount;
        }
        else {
            throw new RuntimeException();
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
    public double deposit(double amount)  {
//        try{
//            Thread.sleep(5);
//        } catch(InterruptedException e) {
//            e.printStackTrace();
//    }
        return balance += amount;
    }
}
