public class incrementDecrement {
    public static void main(String[] args) {
        // Q1
        int x = 3;
        System.out.println("Q1:");
        System.out.println(x++); // prints 3, then x=4
        System.out.println(++x); // x=5, prints 5
        System.out.println(x);   // prints 5

        // Q2
        int y = 8;
        int z = y-- + ++y;
        System.out.println("\nQ2:");
        System.out.println(z);   // prints 16

        // Q3
        int a = 5, b = 2;
        int res = a++ * --b + ++a;
        System.out.println("\nQ3:");
        System.out.println(res); // prints 12
    }
}
