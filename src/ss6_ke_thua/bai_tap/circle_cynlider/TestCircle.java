package ss6_ke_thua.bai_tap.circle_cynlider;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle("green",2);
        Cylinder cylinder = new Cylinder("BLACK",1,2);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());
    }
}
