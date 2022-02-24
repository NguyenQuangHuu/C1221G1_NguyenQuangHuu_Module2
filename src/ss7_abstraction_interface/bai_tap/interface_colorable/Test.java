package ss7_abstraction_interface.bai_tap.interface_colorable;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Square square = new Square("black",4);
        Square square1 = new Square("gray",3);
        System.out.println(square.toString());
        System.out.println(square.getArea());
        System.out.println(square1.getArea());
        System.out.println(rectangle.getArea());
        //Tạo mảng chung cho các đối tượng khác nhau nhưng cùng có 1 lớp cha
        Shape[] shapes = new Shape[3];
        shapes[0] = rectangle;
        shapes[1] = square;
        shapes[2] = square1;
        for (Shape shape: shapes
             ) {
            if(shape instanceof IColorable){
                ((IColorable) shape).howToColor();
            }
        }
        IColorable iColorable = new IColorable() {
            @Override
            public void howToColor() {
                System.out.println("Colorablse");
            }
        };
        iColorable.howToColor();
    }
}
