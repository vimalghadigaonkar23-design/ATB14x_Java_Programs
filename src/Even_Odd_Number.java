import java.util.Scanner;

public class Even_Odd_Number {
    public static void main(String[] args) {

        System.out.println("We are write the code for positive negative no ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a no : ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Number is positive");

        } else if (number < 0) {
            System.out.println("Number is negative");

        } else {
            System.out.println("Number is zero");
        }

        scanner.close();

    }

}
