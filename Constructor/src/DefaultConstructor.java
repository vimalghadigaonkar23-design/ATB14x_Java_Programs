public class DefaultConstructor {
    String name;
    int age;
    String qualification;

    DefaultConstructor(){
         name="vimal";
        age=30;
        qualification="BSC";


    }
void details(){

    System.out.println("student name=" + name );
    System.out.println("Student age=" +age);
    System.out.println("Qualification=" +qualification);
}


    public static void main(String[] args) {
        DefaultConstructor df=new DefaultConstructor();
        df.details();

    }
}
