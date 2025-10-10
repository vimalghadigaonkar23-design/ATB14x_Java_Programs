public class Lab_Ex_13 {
    public static void main(String[] args) {
        int rev=0;
        int num=1234567;

        int fact=num;
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
            System.out.println(rev);

    }
}
