public class Main {

    public static void main(String[] args) {

        Account account =
                new BankAccount(1000);

        ATMService service =
                new ATMServiceImpl(account);

        ATM atm =
                new ATM(service);

        atm.start();
    }
}