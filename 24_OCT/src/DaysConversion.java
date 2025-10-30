
import java.util.Scanner;

public class DaysConversion {
    // Function to convert days
    static void convertDays(int days) {
        int years = days / 365;
        int remainingDays = days % 365;
        int months = remainingDays / 30;
        int daysLeft = remainingDays % 30;

        System.out.println(days + " days = " + years + " years, " + months + " months, and " + daysLeft + " days.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int totalDays = sc.nextInt();

        convertDays(totalDays);
    }
}
