import java.sql.SQLOutput;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter string ");
        String str= sc.nextLine();

        str=str.trim();
        String[] words=str.split("\\s+");

        int count= words.length;
        System.out.println("Total words ="+count);
        sc.close();

    }
}
