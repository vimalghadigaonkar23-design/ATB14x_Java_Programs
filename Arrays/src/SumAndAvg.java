public class SumAndAvg {
    public static void main(String[] args) {


        int[] marks1 = {50, 60, 80, 90, 70};
        int sum = 0;
        for (int j = 0; j < marks1.length; j++) {
            sum = sum + marks1[j];
        }
            double average = (double) sum / marks1.length;

            System.out.println(sum);
            System.out.println(average);


        }
    }
