import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight (in kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter height (in meters): ");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("Your BMI: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Normal");
        } else {
            System.out.println("Overweight");
        }
    }
}
