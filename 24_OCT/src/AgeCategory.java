
import java.util.Scanner;

public class AgeCategory {
    // Function to determine age category
    static void checkAgeCategory(int age) {
        if (age >= 0 && age <= 12)
            System.out.println("You are a Child.");
        else if (age >= 13 && age <= 19)
            System.out.println("You are a Teenager.");
        else if (age >= 20 && age <= 64)
            System.out.println("You are an Adult.");
        else if (age >= 65)
            System.out.println("You are a Senior Citizen.");
        else
            System.out.println("Invalid age entered!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        checkAgeCategory(age);
    }
}
