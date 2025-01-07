import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        System.out.print("Choose conversion type (1/2): ");
        int choice = sc.nextInt();

        double temp, convertedTemp;

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            temp = sc.nextDouble();
            convertedTemp = (temp * 9/5) + 32;
            System.out.printf("Temperature in Fahrenheit: %.2f°F\n", convertedTemp);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            temp = sc.nextDouble();
            convertedTemp = (temp - 32) * 5/9;
            System.out.printf("Temperature in Celsius: %.2f°C\n", convertedTemp);
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
