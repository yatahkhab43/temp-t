import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of late days: ");
        int lateDays = sc.nextInt();

        int fine = 0;

        if (lateDays <= 5) {
            fine = lateDays * 10;
        } else if (lateDays <= 10) {
            fine = 5 * 10 + (lateDays - 5) * 20;
        } else {
            fine = 5 * 10 + 5 * 20 + (lateDays - 10) * 50;
        }

        System.out.println("Total Fine: ₹" + fine);
    }
}
