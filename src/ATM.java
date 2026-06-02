import java.util.Scanner;

public class ATM {

    private ATMService service;
    private Scanner input;

    public ATM(ATMService service) {
        this.service = service;
        input = new Scanner(System.in);
    }

    public void start() {

        int choice;

        do {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    service.deposit();
                    break;

                case 2:
                    service.withdraw();
                    break;

                case 3:
                    service.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }
}