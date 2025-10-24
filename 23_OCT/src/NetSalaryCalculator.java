
import java.util.Scanner;

public class NetSalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Pay: ");
        double basic = sc.nextDouble();

        if (basic > 0) {
            double hra = basic * 0.20; // 20% HRA
            double da = basic * 0.10;  // 10% DA
            double gross = basic + hra + da;
            double tax = gross * 0.10; // 10% Tax
            double netSalary = gross - tax;

            System.out.println("\n--- Salary Details ---");
            System.out.println("Basic Pay: ₹" + basic);
            System.out.println("HRA (20%): ₹" + hra);
            System.out.println("DA (10%): ₹" + da);
            System.out.println("Gross Salary: ₹" + gross);
            System.out.println("Tax (10%): ₹" + tax);
            System.out.println("Net Salary: ₹" + netSalary);
        } else {
            System.out.println("Invalid input! Basic pay must be positive.");
        }
    }
}
