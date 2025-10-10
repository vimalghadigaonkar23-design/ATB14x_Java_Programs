public class WithParameterReturnValue {
    static int addition (int a,int b) {
        int result = a + b;
        return result;
    }
 static int subtraction(int a, int b){
    int result1=a-b;
     return result1;

        }

    public static void main(String[] args) {
    int resultOfSum=addition(5,10);
    int resultOfSubtraction=subtraction(40,20);

    System.out.println(resultOfSum);
    System.out.println(resultOfSubtraction);

    }
}
