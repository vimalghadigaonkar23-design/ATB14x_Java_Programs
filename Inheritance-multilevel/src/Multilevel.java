class grandParent{
    int x=50;
    void grandParentMethod(){
        System.out.println("this is grandparent method");
    }

}
class parent1 extends grandParent{
    int y=80;
    void parentMethod(){

        System.out.println("this is parent method");

    }
}

class child1 extends parent1 {
  int z=100;
  void childMethod(){
      System.out.println("this is child method");
    }
}
public class Multilevel {
    public static void main(String[] args) {
child1 c=new child1();
        System.out.println(c.x);
        c.grandParentMethod();
        System.out.println(c.y);
        c.parentMethod();
        System.out.println(c.z);
        c.childMethod();
    }
}
