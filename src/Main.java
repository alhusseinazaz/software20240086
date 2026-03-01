import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(0.0);
        Scanner scanner = new Scanner(System.in);

        boolean running = true;


        while (running) {
            System.out.println("----------------");
            System.out.println("BANK SYSTEM");
            System.out.println("1.View Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("----------------");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: $" + myAccount.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double dAmount = scanner.nextDouble();
                    myAccount.deposit(dAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double wAmount = scanner.nextDouble();
                    myAccount.withdraw(wAmount);
                    break;
                case 4:
                    running = false;
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        scanner.close();
    }
}