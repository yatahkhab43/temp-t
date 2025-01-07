import java.util.Scanner;

public class DailyStepTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalSteps = 0;
        int dailySteps;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Enter steps for day " + i + ": ");
            dailySteps = sc.nextInt();
            totalSteps += dailySteps;
        }

        double averageSteps = totalSteps / 7.0;

        System.out.println("Total steps: " + totalSteps);
        System.out.printf("Average steps: %.2f\n", averageSteps);
    }
}
