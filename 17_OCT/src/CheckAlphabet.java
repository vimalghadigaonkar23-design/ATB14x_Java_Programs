
import java.util.Scanner;

public class CheckAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter any character: ");
        char ch = sc.next().charAt(0);  // take first character of input

        // Step 2: Check if character is an alphabet
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("✅ '" + ch + "' is an alphabet.");
        } else {
            System.out.println("❌ '" + ch + "' is not an alphabet.");
        }

        sc.close();
    }
}
