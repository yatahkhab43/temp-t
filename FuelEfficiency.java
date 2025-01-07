import java.util.Scanner;

public class FuelEfficiency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance traveled (in km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter fuel consumed (in liters): ");
        double fuel = sc.nextDouble();

        double mileage = distance / fuel;
        System.out.printf("Mileage: %.2f km/l\n", mileage);

        if (mileage > 15) {
            System.out.println("The car is Fuel Efficient.");
        } else {
            System.out.println("The car is Not Fuel Efficient.");
        }
    }
}
