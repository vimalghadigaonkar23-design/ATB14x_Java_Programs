import java.util.Scanner;

public class InputArrayFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] numbers = new int[2][3];

        System.out.println("Enter 6 numbers:");

        // Input
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // Output
        System.out.println("The 2D array is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numbers[i][j] + " ");  // FIXED: print in same row
            }
            System.out.println();  // Move to next line after each row
        }
    }
}
