import java.util.Scanner;

public class GradeProg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks:");
        Float marks = sc.nextFloat();
        if(marks ==0|| marks<=0 || marks >100){
            System.out.println("Enter marks between 1 to 100 ");
        }
        else if(marks>=90 && marks <=100){
            System.out.println("Grade:A");
        } else if (marks>=80 && marks<=89) {
            System.out.println("Grade:B");
        } else if (marks>=70 && marks<=79) {
            System.out.println("Grade:C");
        } else if (marks>=60 && marks<=69) {
            System.out.println("Grade:D");
        }else{
            System.out.println("Grade :F");
        }
    }
}
