public class ParameterConstructor {
    String name;
    int Age;
    String color;

    ParameterConstructor(String n, int a, String c) {
        name = n;
        Age = a;
        color = c;


    }

    void sejal_Details() {
        System.out.println("Amol details "+name+ "age is :"+Age+ "Color is:"+color);
        System.out.println("Vimal details "+name+ "age is :"+Age+ "Color is:"+color);
        System.out.println("Simal details "+name+ "age is :"+Age+ "Color is:"+color);

    }

    public static void main(String[] args) {
        ParameterConstructor PC = new ParameterConstructor("Amol", 20, "Red");
        ParameterConstructor PC1 = new ParameterConstructor("Vimal", 30, "Red");
        ParameterConstructor PC2 = new ParameterConstructor("Simal", 33, "Red");
        PC.sejal_Details();
        PC1.sejal_Details();
        PC2.sejal_Details();
    }
}
