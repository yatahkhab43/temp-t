import java.util.Scanner;

public class CoffeeShopBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Coffee Shop Menu:");
        System.out.println("1. Espresso (₹50)");
        System.out.println("2. Latte (₹80)");
        System.out.println("3. Cappuccino (₹100)");

        int totalBill = 0;
        char moreItems;

        do {
            System.out.print("Enter your choice (1-3): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    totalBill += 50;
                    break;
                case 2:
                    totalBill += 80;
                    break;
                case 3:
                    totalBill += 100;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.print("Do you want to order more items? (y/n): ");
            moreItems = sc.next().charAt(0);

        } while (moreItems == 'y' || moreItems == 'Y');

        System.out.println("Your total bill is: ₹" + totalBill);
    }
}
