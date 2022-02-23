package ss6_ke_thua.bai_tap.shape_triangle;

public class TestShape {
    public static void main(String[] args) {

        Shape shape = new Shape();
        shape.setColor("Cloudy blue");
        shape.setFilled(false);
        Triangle triangle = new Triangle(7,8,9);
        triangle.setColor(shape.getColor());
        triangle.setFilled(shape.isFilled());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
        System.out.println(triangle.toString());
    }
}
