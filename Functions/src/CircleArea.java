public class CircleArea {
    static float circleArea(float radius){
        float pi=3.14f;
        float area=pi*radius*radius;
        return area;

    }
    public static void main(String[] args) {

        float result=circleArea(12);
        System.out.println(result);
    }

}
