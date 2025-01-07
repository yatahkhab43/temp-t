import java.util.Scanner;

public class MobileRecharge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Recharge Plans:");
        System.out.println("1. ₹199: 1.5GB/day");
        System.out.println("2. ₹299: 2GB/day");
        System.out.println("3. ₹399: 3GB/day");

        System.out.print("Select a plan (1-3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected ₹199 plan with 1.5GB/day.");
                break;
            case 2:
                System.out.println("You selected ₹299 plan with 2GB/day.");
                break;
            case 3:
                System.out.println("You selected ₹399 plan with 3GB/day.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
