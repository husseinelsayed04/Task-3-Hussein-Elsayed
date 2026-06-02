import java.util.Scanner;

public class ATMServiceImpl implements ATMService {

    private Account account;
    private Scanner input;

    public ATMServiceImpl(Account account) {
        this.account = account;
        input = new Scanner(System.in);
    }

    @Override
    public void deposit() {

        System.out.print("Enter amount: ");
        double amount = input.nextDouble();

        account.deposit(amount);
    }

    @Override
    public void withdraw() {

        System.out.print("Enter amount: ");
        double amount = input.nextDouble();

        account.withdraw(amount);
    }

    @Override
    public void checkBalance() {

        System.out.println("Current Balance: "
                + account.getBalance());
    }
}