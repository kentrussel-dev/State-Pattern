public class ActiveState implements AccountState{
    @Override
    public void deposit(double depositAmount) {
       this.balance += depositAmount;
       System.out.println(toString());
       
    }
    @Override
    public void withdraw(double withdrawAmount) {
        this.balance -= withdrawAmount;
        System.out.println(toString());
    }
    @Override
    public void activate() {
       System.out.println("Account is already activated!");
       
    }
    @Override
    public void suspend() {
        System.out.println("Account is suspended!");
        this.Account.setState(new SuspendedState());
        
    }
    @Override
    public void close() {
        System.out.println("Account is closed");
        this.Account.setState(new ClosedState());
    }
}