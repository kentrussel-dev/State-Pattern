public class ClosedState implements AccountState{
    @Override
    public void deposit(double depositAmount) {
        System.out.println("You cannot deposit a closed account!");
        System.out.println(toString());
    }
    @Override
    public void withdraw(double withdrawAmount) {
        System.out.println("You cannot withdraw a closed account!");
    }
    @Override
    public void activate() {
        System.out.println("You cannot activate a closed account!");
    }
    @Override
    public void suspend() {
        System.out.println("You cannot suspend a closed account!");
    }
    @Override
    public void close() {
        System.out.println("You cannot withdraw on a closed account!");
        System.out.println(toString());
    }
}