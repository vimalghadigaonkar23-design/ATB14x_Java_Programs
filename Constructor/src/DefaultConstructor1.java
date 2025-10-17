public class DefaultConstructor1 {
String car_name;
int car_wheels;
String color_name;
    DefaultConstructor1(){
      car_name="Audi";
      car_wheels=4;
      color_name="Red";

    }
    void details(){
        car_name="Audi";
        System.out.println("Car name is :"+car_name);
        System.out.println("Car wheel is :"+car_wheels);
        System.out.println("Color name is :"+color_name);
    }

    public static void main(String[] args) {
        DefaultConstructor1 dc1=new DefaultConstructor1();
        dc1.details();
    }
}
