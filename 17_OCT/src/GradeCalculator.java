
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter your marks (0-100): ");
        int marks = sc.nextInt();

        // Step 2: Validate marks
        if (marks < 0 || marks > 100) {
            System.out.println("❌ Invalid marks! Please enter a value between 0 and 100.");
        }
        else {
            // Step 3: Determine grade using if-else-if
            char grade;
            String gradeName;

            if (marks >= 90 && marks <= 100) {
                gradeName = "A+";
            } else if (marks >= 80) {
                gradeName = "A";
            } else if (marks >= 70) {
                gradeName = "B";
            } else if (marks >= 60) {
                gradeName = "C";
            } else if (marks >= 50) {
                gradeName = "D";
            } else if (marks >= 40) {
                gradeName = "E";
            } else {
                gradeName = "Fail";
            }

            // Step 4: Display result
            System.out.println("✅ Your Grade: " + gradeName);
        }

        sc.close();
    }
}
