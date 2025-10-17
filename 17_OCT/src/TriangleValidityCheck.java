
import java.util.Scanner;

public class TriangleValidityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for three sides
        System.out.print("Enter side 1: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double side3 = sc.nextDouble();

        // Step 2: Check if sides are positive
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("❌ Invalid input! Sides must be greater than 0.");
        }
        // Step 3: Apply Triangle Inequality Theorem
        else if ((side1 + side2 > side3) &&
                (side1 + side3 > side2) &&
                (side2 + side3 > side1)) {
            System.out.println("✅ The triangle is valid.");
        }
        else {
            System.out.println("❌ The triangle is NOT valid.");
        }

        sc.close();
    }
}
