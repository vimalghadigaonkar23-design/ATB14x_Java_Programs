
import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Credit Score: ");
        int creditScore = sc.nextInt();

        if (age <= 0 || salary <= 0 || creditScore <= 0) {
            System.out.println("Invalid input! Enter positive values.");
        } else if (age < 18) {
            System.out.println("Not eligible: Minimum age is 18.");
        } else if (age > 80) {
            System.out.println("Not eligible: Maximum age is 80.");
        } else if (salary < 30000) {
            System.out.println("Not eligible: Salary must be at least ₹30,000.");
        } else if (creditScore < 650) {
            System.out.println("Not eligible: Credit Score must be at least 650.");
        } else if (creditScore > 850) {
            System.out.println("Invalid Credit Score! Max value is 850.");
        } else {
            System.out.println("✅ You are eligible for a loan!");
        }
    }
}
