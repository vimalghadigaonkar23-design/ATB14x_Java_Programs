public class SecondMaxNo {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};

        int max = Integer.MIN_VALUE;      // To store the maximum number
        int secondMax = Integer.MIN_VALUE; // To store the second maximum number

        for (int num : numbers) {
            if (num > max) {
                secondMax = max; // previous max becomes second max
                max = num;       // update max
            } else if (num > secondMax && num != max) {
                secondMax = num; // update second max if num < max
            }
        }

        System.out.println("Second maximum number: " + secondMax);
    }
}
