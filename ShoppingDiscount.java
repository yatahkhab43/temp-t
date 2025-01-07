import java.util.Scanner;

public class ShoppingDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total bill amount: ₹");
        double bill = sc.nextDouble();

        if (bill > 1000) {
            bill -= bill * 0.20;
            System.out.println("20% discount applied.");
        } else if (bill >= 500) {
            bill -= bill * 0.10;
            System.out.println("10% discount applied.");
        } else {
            System.out.println("No discount applied.");
        }

        System.out.println("Final bill amount: ₹" + bill);
    }
}
