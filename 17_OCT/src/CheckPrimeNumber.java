
import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Step 2: Check if number is valid
        if (num <= 1) {
            System.out.println("❌ " + num + " is not a prime number.");
        } else {
            boolean isPrime = true;

            // Step 3: Check divisibility
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Step 4: Display result
            if (isPrime) {
                System.out.println("✅ " + num + " is a prime number.");
            } else {
                System.out.println("❌ " + num + " is not a prime number.");
            }
        }

        sc.close();
    }
}
