import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the units consumed: ");
        int units = sc.nextInt();
        int billAmount;

        if (units <= 100) {
            billAmount = units * 5;
        } else if (units <= 300) {
            billAmount = 100 * 5 + (units - 100) * 8;
        } else {
            billAmount = 100 * 5 + 200 * 8 + (units - 300) * 10;
        }

        System.out.println("Electricity Bill: ruppess : " + billAmount);
    }
}
