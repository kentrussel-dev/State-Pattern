public class ActiveState implements AccountState {
    @Override
    public void deposit(double depositAmount, Account account) {
        account.setBalance(account.getBalance() + depositAmount);
        System.out.println(account.toString());
    }

    @Override
    public void withdraw(double withdrawAmount, Account account) {
        account.setBalance(account.getBalance() - withdrawAmount);
        System.out.println(account.toString());
    }

    @Override
    public void activate(Account account) {
        System.out.println("Account is already activated!");
    }

    @Override
    public void suspend(Account account) {
        account.setState(new SuspendedState());
        System.out.println("Account is suspended!");
    }

    @Override
    public void close(Account account) {
        account.setState(new ClosedState());
        System.out.println("Account is closed!");
    }
}