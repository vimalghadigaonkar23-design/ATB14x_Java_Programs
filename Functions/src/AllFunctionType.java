public class AllFunctionType {
    //  No parameter, No return value
    static void NoparameterNoreturnvalue(){
        System.out.println("i will not give you any return");
    }
    // With parameter, No return value
    static void WithparameterNoreturnvalue(int a , int b){
        int sum=a+b;
        System.out.println(sum);
    }
    // No parameter, With return value
    static int NoparameterWithreturnvalue(){
     int number =7;
     return number;

    }

    // With parameter, With return value
    static int WithparameterWithreturnvalue(int a, int b){
        int sub=a-b;
        return sub;


    }
    public static void main(String[] args) {
        NoparameterNoreturnvalue();
        WithparameterNoreturnvalue(10,20);
        System.out.println(NoparameterWithreturnvalue());
        System.out.println(WithparameterWithreturnvalue(20,50));

    }
}
