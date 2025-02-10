public class Account{
    public String accountNumber;
    public double balance;
    public AccountState accountState;

    public Account(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        accountState = new ActiveState();
    }

    public void setState(AccountState accountState){
        this.accountState = accountState;
    }

    public AccountState getState(){
        return this.accountState;
    }

    public void deposit(Double depositAmount){
        accountState.deposit(depositAmount);
    }
    public void withdraw(Double withdrawAmount){
        accountState.withdraw(withdrawAmount);
    }
    public void activate(){
        accountState.activate();
    }
    public void suspend(){
       accountState.suspend();
    }
    public void close(){
        accountState.close();
    }
    public String toString(){
        return "Account Number: " + accountNumber + " Balance: " + balance;    
    }
}