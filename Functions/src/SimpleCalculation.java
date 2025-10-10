public class SimpleCalculation {
    static int sum(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static int div(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sub(30,50));
        System.out.println(mul(10,50));
        System.out.println(div(5,50));
    }
}
