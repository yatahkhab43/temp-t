import java.util.Scanner;

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int TICKET_PRICE = 200;

        System.out.print("Enter the number of tickets (1-4): ");
        int tickets = sc.nextInt();

        if (tickets < 1 || tickets > 4) {
            System.out.println("You can only book between 1 and 4 tickets.");
            return;
        }

        int totalAmount = tickets * TICKET_PRICE;

        if (totalAmount > 500) {
            totalAmount -= totalAmount * 0.10; // Apply 10% discount
            System.out.println("10% discount applied.");
        }

        System.out.println("Total amount to pay: ₹" + totalAmount);
    }
}
