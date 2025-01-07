import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Set your password: ");
        String password = sc.nextLine();

        if (password.length() >= 8 && password.matches(".*\\d.*")) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password must be at least 8 characters long and contain at least one digit.");
        }
    }
}
