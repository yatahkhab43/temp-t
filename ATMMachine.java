import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000; 
        int transactions = 0;
        final int MAX_TRANSACTIONS = 5;

        while (transactions < MAX_TRANSACTIONS) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance Inquiry");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    int deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Amount deposited successfully.");
                    transactions++;
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    int withdraw = sc.nextInt();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    transactions++;
                    break;
                case 3:
                    System.out.println("Current balance: ₹" + balance);
                    transactions++;
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
            sc.close();
        }
        System.out.println("Transaction limit reached. Please start a new session.");
    }
}
