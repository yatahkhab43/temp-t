import java.util.Scanner;

public class AttendanceTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total classes held: ");
        int totalClasses = sc.nextInt();

        System.out.print("Enter classes attended: ");
        int attendedClasses = sc.nextInt();

        double attendancePercentage = (attendedClasses * 100.0) / totalClasses;
        System.out.printf("Attendance Percentage: %.2f%%\n", attendancePercentage);

        if (attendancePercentage >= 75) {
            System.out.println("The student is eligible for exams.");
        } else {
            System.out.println("The student is not eligible for exams.");
        }
    }
}
