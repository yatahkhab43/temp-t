import java.util.Scanner;

public class RestaurantMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Burger (₹120)");
        System.out.println("2. Fries (₹50)");

        int totalBill = 0;

        char moreItems;
        do {
            System.out.print("Enter your choice (1-2): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    totalBill += 120;
                    break;
                case 2:
                    totalBill += 50;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

            System.out.print("Do you want to order more? (y/n): ");
            moreItems = sc.next().charAt(0);
        } while (moreItems == 'y' || moreItems == 'Y');

        System.out.println("Total bill: ₹" + totalBill);
    }
}
