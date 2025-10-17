class Parent {
    int x = 20;

    void show() {
        System.out.println("Parent method");
    }

}

class child extends Parent {
    int y = 30;

    void display() {
        System.out.println("child method");
    }

}

public class single {


    public static void main(String[] args) {
        child c = new child();
        System.out.println(c.x);
        c.show();
        System.out.println(c.y);
        c.display();
    }
}
