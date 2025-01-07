import java.util.Scanner;

public class GroceryBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalBill = 0;

        System.out.print("Enter the number of items: ");
        int items = sc.nextInt();

        for (int i = 1; i <= items; i++) {
            System.out.print("Enter price of item " + i + ": ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity of item " + i + ": ");
            int quantity = sc.nextInt();

            totalBill += price * quantity;
        }

        System.out.println("Total bill: ₹" + totalBill);
    }
}
