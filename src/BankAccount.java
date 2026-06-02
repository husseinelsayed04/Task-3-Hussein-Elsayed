public class BankAccount implements Account {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }

        balance += amount;
        System.out.println("Deposit successful.");
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance!");
            return;
        }

        balance -= amount;
        System.out.println("Withdrawal successful.");
    }

    @Override
    public double getBalance() {
        return balance;
    }
}