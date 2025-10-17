public class ConstructorOverloading {
    String name;
    String color;
    int wheels;

    ConstructorOverloading(){
        name="unknown";
        color="unknownc";
        wheels=5;

    }
    ConstructorOverloading(String n,String c,int w){
         name =n;
         color=c;
         wheels=w;
    }
     void details(){
         System.out.println("Car name : "+name);
         System.out.println("Car color:"+color);
         System.out.println("Car Wheels:"+wheels);

     }
    public static void main(String[] args) {
        ConstructorOverloading cd=new ConstructorOverloading();
        ConstructorOverloading cd1=new ConstructorOverloading("Audi","Red",4);
        cd.details();
        cd1.details();
    }
}
