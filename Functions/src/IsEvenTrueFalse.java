public class IsEvenTrueFalse {

    static boolean isEvenTrueFalse(int num){
      if(num%2==0)  {
          return true;
      }else {
          return false;

      }
    }
    public static void main(String[] args) {

        boolean result=isEvenTrueFalse(10);
        System.out.println(result);
        boolean result1=isEvenTrueFalse(7);
        System.out.println(result1);
    }

}
