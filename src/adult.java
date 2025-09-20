import java.util.Scanner;

public class adult {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = scanner.nextInt();

        // Nested Ternary
    // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);

        String category = (age < 18) ? "Minor" :
                (age <= 59) ? "Adult" : "Senior";

        System.out.println("You are a " + category);

        scanner.close();
}
}