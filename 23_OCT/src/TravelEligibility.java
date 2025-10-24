import java.util.Scanner;

public class TravelEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Visa Status (valid/invalid): ");
        String visa = sc.nextLine().toLowerCase();

        if (age < 0)
            System.out.println("Invalid age entered!");
        else if (age < 18)
            System.out.println("Not eligible: Must be 18 or older to travel.");
        else if (visa.equals("valid"))
            System.out.println("✅ You are allowed to travel.");
        else
            System.out.println("❌ You cannot travel due to invalid visa.");
    }
}
