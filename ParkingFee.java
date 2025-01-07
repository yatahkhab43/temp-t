import java.util.Scanner;

public class ParkingFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parking hours: ");
        int hours = sc.nextInt();
        int fee = 20;

        if (hours > 2) {
            fee += (hours - 2) * 10;
        }

        System.out.println("Parking Fee: ₹" + fee);
    }
}
