package ss7_abstraction_interface.bai_tap.interface_resize;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getArea();
        System.out.println(circle.getArea());
        circle.resize(Math.random());
        System.out.println(circle.getArea());

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getArea());
        rectangle.resize(Math.random());
        System.out.println(rectangle.getArea());

        Square square = new Square();
        System.out.println(square.getArea());
        square.resize(Math.random());
        System.out.println(square.getArea());

    }
}
