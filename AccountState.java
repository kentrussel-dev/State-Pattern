public interface AccountState {
    void deposit(double depositAmount, Account account);
    void withdraw(double withdrawAmount, Account account);
    void activate(Account account);
    void suspend(Account account);
    void close(Account account);
}