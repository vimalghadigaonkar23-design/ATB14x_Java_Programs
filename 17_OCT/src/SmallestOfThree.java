

    import java.util.Scanner;

    public class SmallestOfThree {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input three numbers
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            System.out.print("Enter the third number: ");
            int num3 = scanner.nextInt();

            // Use if-else to find the smallest
            int smallest;

            if (num1 <= num2 && num1 <= num3) {
                smallest = num1;
            } else if (num2 <= num1 && num2 <= num3) {
                smallest = num2;
            } else {
                smallest = num3;
            }

            System.out.println("The smallest number is: " + smallest);

            scanner.close();
        }
    }


