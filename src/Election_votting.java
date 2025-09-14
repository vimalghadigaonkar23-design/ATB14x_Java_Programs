import java.util.Scanner;

public class Election_votting {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter age of person ");
        int age= scanner.nextInt();

        if (age >=18){
            System.out.println("Person can vote");
        } else {
            System.out.println("Person cant not vote");
        }


    }
}
