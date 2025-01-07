import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your monthly income: ₹");
        double income = sc.nextDouble();

        System.out.print("Enter the loan amount required: ₹");
        double loanAmount = sc.nextDouble();

        System.out.print("Enter the number of repayment months: ");
        int months = sc.nextInt();

        double emi = loanAmount / months;

        if (emi <= income * 0.5) {
            System.out.println("You are eligible for the loan.");
        } else {
            System.out.println("You are not eligible for the loan.");
        }
    }
}
